import {NgModule} from "@angular/core";
import {BrowserModule} from "@angular/platform-browser";
import {AppComponent} from "./app.component";
import {Http, Headers, Response} from "@angular/http";
import {Observable} from "rxjs";
import {ErrorObservable} from "rxjs/observable/ErrorObservable";


@NgModule({
    imports: [BrowserModule],
    declarations: [AppComponent],
    bootstrap: [AppComponent]
})
export class AppModule {
}

export class TestService {
    static HEADERS = {
        headers: new Headers({'Content-Type': 'application/json'})
    };

    constructor(private http: Http) {
    }

    get() {
        return this.mapResponse(this.http.get('http://localhost:8080/test', TestService.HEADERS));
    }

    private mapResponse(responseObservable: Observable<Response>): Observable<any> {
        return responseObservable.map((response: Response)=> {
            if (response.hasOwnProperty('_body') && response['_body'] !== '') {
                return response.json();
            } else {
                return {};
            }
        }).catch(error=> {
            return ErrorObservable.create(error);
        });
    }
}
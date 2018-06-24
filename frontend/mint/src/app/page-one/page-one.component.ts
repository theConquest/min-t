import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-page-one',
  templateUrl: './page-one.component.html',
  styleUrls: ['./page-one.component.css']
})
export class PageOneComponent implements OnInit {
  response;
  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get('/mint/testReq').subscribe(response => {
      console.log(response);
      this.response = JSON.stringify(response);
    });
  }
}

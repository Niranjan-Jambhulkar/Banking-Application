import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';



@Component({
  selector: 'app-view-balance',
  standalone: true,
  imports: [HttpClientModule, CommonModule],
  templateUrl: './view-balance.component.html',
  styleUrl: './view-balance.component.css'
})
export class ViewBalanceComponent {
  accNo:any = 124568964789;
  ifsc:any = "HDGF00145";
  balance:any = 500000;
  data:any;

  constructor(private http: HttpClient){

  }

  get(){
    this.http.get("http://localhost:8080/acco").subscribe((data)=>{this.data = data});
  }
}

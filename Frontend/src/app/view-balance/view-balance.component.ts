import { Component } from '@angular/core';

@Component({
  selector: 'app-view-balance',
  standalone: true,
  imports: [],
  templateUrl: './view-balance.component.html',
  styleUrl: './view-balance.component.css'
})
export class ViewBalanceComponent {
  accNo:any = 124568964789;
  ifcs:any = "HDGF00145";
  balance:any = 500000;
}

import { Routes } from '@angular/router';
import { ViewBalanceComponent } from './view-balance/view-balance.component';
import { DepositComponent } from './deposit/deposit.component';
import { WithdrawComponent } from './withdraw/withdraw.component';

export const routes: Routes = [
    {path: "view", component:ViewBalanceComponent},
    {path: "deposit", component:DepositComponent},
    {path: "withdraw", component:WithdrawComponent}
];

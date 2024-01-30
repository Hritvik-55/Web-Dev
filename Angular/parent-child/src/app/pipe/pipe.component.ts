import { Component } from '@angular/core';
import { CurrencyPipe,DatePipe,UpperCasePipe } from '@angular/common';
import { UsdInrPipe } from '../pipes/usd-inr.pipe';

@Component({
  selector: 'app-pipe',
  standalone: true,
  imports: [CurrencyPipe,DatePipe,UpperCasePipe,UsdInrPipe],
  templateUrl: './pipe.component.html',
  styleUrl: './pipe.component.css'
})
export class PipeComponent {
  amount:string="34";
  birthday=new Date(2000,1,9);
  toggle:boolean=true;
  get format(){
    return this.toggle?'mediumDate':'fullDate';
  }
  toggleformat(){
    this.toggle=!this.toggle;
  }

  usd:number=20;
  


}

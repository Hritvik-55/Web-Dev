import { Component,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-item-output',
  standalone: true,
  imports: [],
  templateUrl: './item-output.component.html',
  styleUrl: './item-output.component.css'
})
export class ItemOutputComponent {
  @Output() newItemEvent=new EventEmitter<string>();
  addNewItem(value:string){
    this.newItemEvent.emit(value);
  }

}

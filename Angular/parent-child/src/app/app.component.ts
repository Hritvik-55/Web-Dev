import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ItemDetailComponent } from './item-detail/item-detail.component';
import { ItemOutputComponent } from './item-output/item-output.component';
import { FormsModule } from '@angular/forms';
import { TemplateReferenceVariableComponent } from './template-reference-variable/template-reference-variable.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,ItemDetailComponent,ItemOutputComponent,CommonModule,FormsModule,TemplateReferenceVariableComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'parent-child';
  currentItem:string='Television';
  items=['item1', 'item2', 'item3', 'item4'];
  addItem(newItem:string){
    this.items.push(newItem);
  }
  name:any="";
}

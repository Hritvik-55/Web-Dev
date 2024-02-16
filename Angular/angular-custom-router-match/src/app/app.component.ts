import { Component, VERSION } from '@angular/core';
import { RouterOutlet,RouterLink } from '@angular/router';
import { ProfileComponent } from './profile/profile.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,ProfileComponent,RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-custom-router-match';
  name='Angular '+ VERSION.major;
}

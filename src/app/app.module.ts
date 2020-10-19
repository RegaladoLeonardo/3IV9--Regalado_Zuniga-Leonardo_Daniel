import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { StoreModule } from '@ngrx/store';
import { StoreDevtoolsModule } from '@ngrx/store-devtools';
import { EffectsModule } from '@ngrx/effects';

import { AppComponent } from './app.component';
import { SharedModule } from './shared/shared.module';
import { UserModule } from './users/user.module';
import { AppRouting } from './app-routing.module';
import { appReducer } from './store/app.reducer';
import { environment } from '../environments/environment.prod';
import { appEffects } from './store/effects/index';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    SharedModule,
    UserModule,
    AppRouting,
    HttpClientModule,
    StoreModule.forRoot(appReducer),
    EffectsModule.forRoot(appEffects),
    StoreDevtoolsModule.instrument({
      maxAge: 25,
      logOnly: environment.production
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

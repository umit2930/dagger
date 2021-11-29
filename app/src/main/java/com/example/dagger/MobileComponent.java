package com.example.dagger;


import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@Component
public interface MobileComponent {

    Mobile buildMobile();

//    void injectField(MainActivity mainActivity);
//
//
//    @Subcomponent.Builder
//    interface Builder {
//
//
//        Builder bindDpi(@BindsInstance @Dpi int dpi);
//
//        @BindsInstance
//        Builder bindGorillaGlass(@GorillaGlass int gorillaGlass);
//
//
//
//        MobileComponent build();
//    }

//    @Component.Factory
//    interface Factory {
//
//        MobileComponent create( @BindsInstance @Dpi int dpi, @BindsInstance @GorillaGlass int gorillaGlass,@BindsInstance @Named("lenz") String lenz);
//
//    }


}

package com.facebook.ads;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements AudienceNetworkActivityApi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkActivity f22984a;

    public b(AudienceNetworkActivity audienceNetworkActivity) {
        this.f22984a = audienceNetworkActivity;
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super/*android.app.Activity*/.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void finish(int i10) {
        super/*android.app.Activity*/.finish();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onActivityResult(int i10, int i11, Intent intent) {
        super/*android.app.Activity*/.onActivityResult(i10, i11, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onBackPressed() {
        super/*android.app.Activity*/.onBackPressed();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.app.Activity*/.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onCreate(Bundle bundle) {
        super/*android.app.Activity*/.onCreate(bundle);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onDestroy() {
        super/*android.app.Activity*/.onDestroy();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onPause() {
        super/*android.app.Activity*/.onPause();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onResume() {
        super/*android.app.Activity*/.onResume();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onSaveInstanceState(Bundle bundle) {
        super/*android.app.Activity*/.onSaveInstanceState(bundle);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onStart() {
        super/*android.app.Activity*/.onStart();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public void onStop() {
        super/*android.app.Activity*/.onStop();
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super/*android.app.Activity*/.onTouchEvent(motionEvent);
    }
}

package com.pairip.application;

import android.content.Context;
import android.content.pm.PackageManager;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.pairip.SignatureCheck;
import com.pairip.VMRunner;

/* loaded from: classes2.dex */
public class Application extends AkApplication {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) throws PackageManager.NameNotFoundException {
        VMRunner.setContext(context);
        SignatureCheck.verifyIntegrity(context);
        super.attachBaseContext(context);
    }
}

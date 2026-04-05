package com.fyber.inneractive.sdk.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Environment;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.b1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import hr.kNq.ikJMrW;
import java.io.File;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v extends e {
    public v(LinkedHashMap linkedHashMap, i0 i0Var, g1 g1Var) {
        super(linkedHashMap, i0Var, g1Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.e
    public final String c() {
        return (String) this.f24172b.get("uri");
    }

    @Override // com.fyber.inneractive.sdk.mraid.f
    public final void a() {
        String str = (String) this.f24172b.get("uri");
        if (str != null) {
            String externalStorageState = "";
            if (!"".equals(str)) {
                i0 i0Var = this.f24173c;
                Context contextA = com.fyber.inneractive.sdk.util.o.a(i0Var.f26879b);
                try {
                    externalStorageState = Environment.getExternalStorageState();
                } catch (Throwable unused) {
                }
                if (!"mounted".equals(externalStorageState) || com.fyber.inneractive.sdk.util.o.f26796a.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    i0Var.a(k.STORE_PICTURE, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
                    IAlog.a("Error downloading file. Please check if the Android permission is not granted, or maybe the device does not have an SD card mounted? ", new Object[0]);
                    return;
                }
                if (contextA instanceof Activity) {
                    new AlertDialog.Builder(com.fyber.inneractive.sdk.util.o.a(i0Var.f26879b)).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton(ikJMrW.xoFFJILd, (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new com.fyber.inneractive.sdk.web.y(i0Var, str)).setCancelable(true).show();
                    return;
                }
                com.fyber.inneractive.sdk.util.r.f26804b.post(new com.fyber.inneractive.sdk.web.v("Downloading image to Picture gallery..."));
                new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
                com.fyber.inneractive.sdk.flow.x xVar = i0Var.f26896s;
                IAConfigManager.O.f23224s.a(new b1(new com.fyber.inneractive.sdk.web.x(i0Var), str, xVar != null ? xVar.f23946c : null));
                return;
            }
        }
        this.f24173c.a(k.STORE_PICTURE, "Image can't be stored with null or empty URL");
        IAlog.a("Mraid Store Picture -Invalid URI ", new Object[0]);
    }
}

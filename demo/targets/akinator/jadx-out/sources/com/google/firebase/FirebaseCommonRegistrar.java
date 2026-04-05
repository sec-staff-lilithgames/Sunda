package com.google.firebase;

import android.os.Build;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bi.c> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bk.c.component());
        arrayList.add(zi.c.component());
        arrayList.add(bk.i.create("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(bk.i.create("fire-core", PtLatqAYjEFT.IpbctyEBH));
        arrayList.add(bk.i.create("device-name", a(Build.PRODUCT)));
        arrayList.add(bk.i.create("device-model", a(Build.DEVICE)));
        arrayList.add(bk.i.create("device-brand", a(Build.BRAND)));
        arrayList.add(bk.i.fromContext("android-target-sdk", new com.google.android.gms.internal.ads.a(3)));
        arrayList.add(bk.i.fromContext("android-min-sdk", new com.google.android.gms.internal.ads.a(4)));
        arrayList.add(bk.i.fromContext("android-platform", new com.google.android.gms.internal.ads.a(5)));
        arrayList.add(bk.i.fromContext("android-installer", new com.google.android.gms.internal.ads.a(6)));
        String strDetectVersion = bk.e.detectVersion();
        if (strDetectVersion != null) {
            arrayList.add(bk.i.create("kotlin", strDetectVersion));
        }
        return arrayList;
    }
}

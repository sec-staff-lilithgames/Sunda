package com.moloco.sdk.internal.publisher.nativead.parser;

import android.content.Context;
import ek.w;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f46587c;

    public /* synthetic */ c(Context context, int i10) {
        this.f46586b = i10;
        this.f46587c = context;
    }

    @Override // kv.a
    public final Object invoke() throws IOException {
        switch (this.f46586b) {
            case 0:
                return d.a(this.f46587c);
            case 1:
                File fileDataStoreFile = j4.a.dataStoreFile(this.f46587c, "firebaseSessions/sessionConfigsDataStore.data");
                w.b(fileDataStoreFile);
                return fileDataStoreFile;
            default:
                File fileDataStoreFile2 = j4.a.dataStoreFile(this.f46587c, "firebaseSessions/sessionDataStore.data");
                w.b(fileDataStoreFile2);
                return fileDataStoreFile2;
        }
    }
}

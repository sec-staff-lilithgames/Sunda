package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f24210e = IAlog.a(e0.class);

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.cache.g f24211d;

    public e0(Context context, com.fyber.inneractive.sdk.cache.a aVar, com.fyber.inneractive.sdk.player.cache.g gVar) {
        super(context, aVar);
        this.f24211d = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.d0
    public final com.fyber.inneractive.sdk.cache.m a() {
        try {
            if (this.f24211d != null && this.f24203b.d()) {
                com.fyber.inneractive.sdk.player.cache.g gVar = this.f24211d;
                String strC = this.f24203b.c();
                gVar.getClass();
                try {
                } catch (Exception e10) {
                    IAlog.f("%s: failure on filePath: %s", IAlog.a(com.fyber.inneractive.sdk.player.cache.g.class), e10);
                }
                if (gVar.f24366i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                if (!com.fyber.inneractive.sdk.player.cache.g.f24356p.matcher(strC).matches()) {
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + strC + "\"");
                }
                com.fyber.inneractive.sdk.player.cache.e eVar = (com.fyber.inneractive.sdk.player.cache.e) gVar.f24367j.get(strC);
                File fileA = eVar == null ? null : eVar.a(0);
                String absolutePath = (fileA == null || !fileA.exists()) ? null : fileA.getAbsolutePath();
                Uri uri = (Uri) this.f24203b.a(absolutePath);
                if (uri == null) {
                    new c0();
                    return new com.fyber.inneractive.sdk.cache.m();
                }
                IAlog.a("Get cached file: %s", absolutePath);
                if (this.f24204c == null) {
                    this.f24204c = this.f24202a.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                return new com.fyber.inneractive.sdk.cache.m(uri, this.f24204c.getString(this.f24203b.b(), null));
            }
            new c0();
            return new com.fyber.inneractive.sdk.cache.m();
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    @Override // com.fyber.inneractive.sdk.network.d0
    public final boolean a(String str, String str2) {
        com.fyber.inneractive.sdk.player.cache.g gVar;
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (bArrDecode != null && (gVar = this.f24211d) != null) {
                com.fyber.inneractive.sdk.player.cache.d dVarA = gVar.a(str);
                if (dVarA == null) {
                    IAlog.f("%s: Error getting editor", f24210e);
                    return false;
                }
                dVarA.a(bArrDecode);
                dVarA.a();
                return true;
            }
            IAlog.f("%s: Invalid content", f24210e);
            return false;
        } catch (IOException e10) {
            e = e10;
            IAlog.f("%s: Error writing cache: ", f24210e, e);
            return false;
        } catch (IllegalArgumentException e11) {
            e = e11;
            IAlog.f("%s: Error writing cache: ", f24210e, e);
            return false;
        }
    }
}

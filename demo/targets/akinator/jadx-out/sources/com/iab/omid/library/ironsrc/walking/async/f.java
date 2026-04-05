package com.iab.omid.library.ironsrc.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f extends a {
    public f(b.InterfaceC0192b interfaceC0192b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0192b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.ironsrc.internal.c cVarC = com.iab.omid.library.ironsrc.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : cVarC.b()) {
                if (this.f31000c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f31002e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.ironsrc.utils.c.h(this.f31001d, this.f31004b.a())) {
            return null;
        }
        this.f31004b.a(this.f31001d);
        return this.f31001d.toString();
    }

    @Override // com.iab.omid.library.ironsrc.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}

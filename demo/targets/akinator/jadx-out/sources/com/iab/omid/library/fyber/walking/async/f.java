package com.iab.omid.library.fyber.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.fyber.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f extends a {
    public f(b.InterfaceC0184b interfaceC0184b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0184b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.fyber.internal.c cVarC = com.iab.omid.library.fyber.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : cVarC.b()) {
                if (this.f30729c.contains(aVar.c())) {
                    aVar.d().b(str, this.f30731e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.fyber.utils.c.h(this.f30730d, this.f30733b.a())) {
            return null;
        }
        this.f30733b.a(this.f30730d);
        return this.f30730d.toString();
    }

    @Override // com.iab.omid.library.fyber.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}

package com.iab.omid.library.appodeal.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.appodeal.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f extends a {
    public f(b.InterfaceC0176b interfaceC0176b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0176b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.appodeal.internal.c cVarC = com.iab.omid.library.appodeal.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.appodeal.adsession.a aVar : cVarC.b()) {
                if (this.f30464c.contains(aVar.c())) {
                    aVar.d().b(str, this.f30466e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.appodeal.utils.c.h(this.f30465d, this.f30468b.a())) {
            return null;
        }
        this.f30468b.a(this.f30465d);
        return this.f30465d.toString();
    }

    @Override // com.iab.omid.library.appodeal.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}

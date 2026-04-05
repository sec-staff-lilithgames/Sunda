package com.iab.omid.library.amazon.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.amazon.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f extends a {
    public f(b.InterfaceC0168b interfaceC0168b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0168b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.amazon.internal.c cVarC = com.iab.omid.library.amazon.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.amazon.adsession.a aVar : cVarC.b()) {
                if (this.f30193c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f30195e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.amazon.utils.c.h(this.f30194d, this.f30197b.a())) {
            return null;
        }
        this.f30197b.a(this.f30194d);
        return this.f30194d.toString();
    }

    @Override // com.iab.omid.library.amazon.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}

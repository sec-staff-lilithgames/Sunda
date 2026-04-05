package com.iab.omid.library.unity3d.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f extends a {
    public f(b.InterfaceC0203b interfaceC0203b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0203b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.unity3d.internal.c cVarC = com.iab.omid.library.unity3d.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.unity3d.adsession.a aVar : cVarC.b()) {
                if (this.f31380c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f31382e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.unity3d.utils.c.h(this.f31381d, this.f31384b.a())) {
            return null;
        }
        this.f31384b.a(this.f31381d);
        return this.f31381d.toString();
    }

    @Override // com.iab.omid.library.unity3d.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}

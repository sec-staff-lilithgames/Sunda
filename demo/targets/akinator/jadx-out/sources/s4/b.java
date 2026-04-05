package s4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f85370a;

    public b(c cVar) {
        this.f85370a = cVar == null ? Build.VERSION.SDK_INT >= 28 ? new e() : new d() : cVar;
    }

    public k create(Context context) {
        ProviderInfo providerInfo;
        u3.g gVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        w3.i.checkNotNull(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        c cVar = this.f85370a;
        Iterator<ResolveInfo> it = cVar.queryIntentContentProviders(packageManager, intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = cVar.getProviderInfo(it.next());
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            gVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signingSignatures = cVar.getSigningSignatures(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signingSignatures) {
                    arrayList.add(signature.toByteArray());
                }
                gVar = new u3.g(str, str2, "emojicompat-emoji-font", (List<List<byte[]>>) Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
            }
        }
        if (gVar == null) {
            return null;
        }
        return new f0(context, gVar);
    }
}

package zh;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import nh.l6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f97975a;

    /* renamed from: b, reason: collision with root package name */
    public final yh.b f97976b;

    public e(AppMeasurementSdk appMeasurementSdk, yh.b bVar) {
        this.f97976b = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new d(this));
        this.f97975a = new HashSet();
    }

    @Override // zh.a
    public final yh.b zza() {
        return this.f97976b;
    }

    @Override // zh.a
    public final void zzb(Set set) {
        HashSet hashSet = this.f97975a;
        hashSet.clear();
        HashSet hashSet2 = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet2.size() >= 50) {
                break;
            }
            l6 l6Var = c.f97968a;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (!Character.isLetter(iCodePointAt)) {
                    if (iCodePointAt == 95) {
                        iCodePointAt = 95;
                    }
                }
                int length = str.length();
                int iCharCount = Character.charCount(iCodePointAt);
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (iCodePointAt2 == 95 || Character.isLetterOrDigit(iCodePointAt2)) {
                            iCharCount += Character.charCount(iCodePointAt2);
                        }
                    } else if (str.length() != 0) {
                        int iCodePointAt3 = str.codePointAt(0);
                        if (Character.isLetter(iCodePointAt3)) {
                            int length2 = str.length();
                            int iCharCount2 = Character.charCount(iCodePointAt3);
                            while (true) {
                                if (iCharCount2 >= length2) {
                                    String strZzb = zzjm.zzb(str);
                                    if (strZzb != null) {
                                        str = strZzb;
                                    }
                                    Preconditions.checkNotNull(str);
                                    hashSet2.add(str);
                                } else {
                                    int iCodePointAt4 = str.codePointAt(iCharCount2);
                                    if (iCodePointAt4 == 95 || Character.isLetterOrDigit(iCodePointAt4)) {
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hashSet.addAll(hashSet2);
    }

    @Override // zh.a
    public final void zzc() {
        this.f97975a.clear();
    }
}

package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: com.facebook.ads.redexgen.X.od, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2600od extends Exception implements C1S {
    public final int A00;
    public final long A01;
    public static final String A03 = AbstractC09264a.A0h(0);
    public static final String A04 = AbstractC09264a.A0h(1);
    public static final String A07 = AbstractC09264a.A0h(2);
    public static final String A05 = AbstractC09264a.A0h(3);
    public static final String A06 = AbstractC09264a.A0h(4);
    public static final C1R<C2600od> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oe
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return new C2600od(bundle);
        }
    };

    public C2600od(Bundle bundle) {
        this(bundle.getString(A07), A09(bundle), bundle.getInt(A03, 1000), bundle.getLong(A04, SystemClock.elapsedRealtime()));
    }

    public C2600od(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.A00 = i10;
        this.A01 = j10;
    }

    public static RemoteException A08(String str) {
        return new RemoteException(str);
    }

    public static Throwable A09(Bundle bundle) {
        String string = bundle.getString(A05);
        String causeClassName = A06;
        String string2 = bundle.getString(causeClassName);
        Throwable thA0A = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, C2600od.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                thA0A = A0A(cls, string2);
            }
        } catch (Throwable unused) {
            if (thA0A != null) {
                return thA0A;
            }
        }
        if (thA0A == null) {
            return A08(string2);
        }
        return thA0A;
    }

    public static Throwable A0A(Class<?> clazz, String str) throws Exception {
        return (Throwable) clazz.getConstructor(String.class).newInstance(str);
    }
}

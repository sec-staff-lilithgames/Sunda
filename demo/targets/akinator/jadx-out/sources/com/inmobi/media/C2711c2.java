package com.inmobi.media;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import java.util.BitSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2711c2 {

    /* renamed from: a, reason: collision with root package name */
    public BitSet f32700a;

    public final void a(String b64String) {
        byte[] value;
        BitSet bitSetValueOf;
        kotlin.jvm.internal.e0.checkNotNullParameter(b64String, "b64String");
        try {
            value = Base64.decode(b64String, 0);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
            value = null;
        }
        if (value != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
            if (R3.f32183a.P()) {
                bitSetValueOf = BitSet.valueOf(value);
            } else {
                kotlin.jvm.internal.e0.checkNotNullParameter(value, "<this>");
                BitSet bitSet = new BitSet(value.length * 8);
                int i10 = 0;
                for (byte b10 : value) {
                    int i11 = 0;
                    while (i11 < 8) {
                        boolean z10 = true;
                        int i12 = i10 + 1;
                        if (((b10 >> ((byte) i11)) & 1) != 1) {
                            z10 = false;
                        }
                        bitSet.set(i10, z10);
                        i11++;
                        i10 = i12;
                    }
                }
                bitSetValueOf = bitSet;
            }
            this.f32700a = bitSetValueOf;
        }
    }
}

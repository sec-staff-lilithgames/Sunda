package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f28224a;

    public i(Resources resources) {
        this.f28224a = (Resources) com.google.android.exoplayer2.util.a.checkNotNull(resources);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(com.google.android.exoplayer2.z0 r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            java.lang.String r0 = r8.f28793e
            java.lang.String r1 = r8.f28792c
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L34
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L34
        L15:
            int r2 = com.google.android.exoplayer2.util.n1.f28506a
            r4 = 21
            if (r2 < r4) goto L20
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            goto L26
        L20:
            java.util.Locale r2 = new java.util.Locale
            r2.<init>(r0)
            r0 = r2
        L26:
            java.util.Locale r2 = com.google.android.exoplayer2.util.n1.getDefaultDisplayLocale()
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L36
        L34:
            r0 = r3
            goto L57
        L36:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L57
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L57
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L57
        L57:
            java.lang.String r8 = r7.b(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r8 = r7.c(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L71
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L70
            r1 = r3
        L70:
            r8 = r1
        L71:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.i.a(com.google.android.exoplayer2.z0):java.lang.String");
    }

    public final String b(com.google.android.exoplayer2.z0 z0Var) throws Resources.NotFoundException {
        int i10 = z0Var.f28795g;
        int i11 = i10 & 2;
        Resources resources = this.f28224a;
        String string = i11 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i10 & 4) != 0) {
            string = c(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i10 & 8) != 0) {
            string = c(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i10 & 1088) != 0 ? c(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String c(String... strArr) throws Resources.NotFoundException {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f28224a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.google.android.exoplayer2.ui.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getTrackName(com.google.android.exoplayer2.z0 r13) throws android.content.res.Resources.NotFoundException {
        /*
            r12 = this;
            java.lang.String r0 = r13.f28802n
            int r1 = r13.f28798j
            int r2 = r13.A
            int r3 = r13.f28808t
            int r4 = r13.f28807s
            java.lang.String r5 = r13.f28799k
            int r0 = com.google.android.exoplayer2.util.l0.getTrackType(r0)
            r6 = 1
            r7 = 2
            r8 = -1
            if (r0 == r8) goto L16
            goto L33
        L16:
            java.lang.String r0 = com.google.android.exoplayer2.util.l0.getVideoMediaMimeType(r5)
            if (r0 == 0) goto L1e
        L1c:
            r0 = r7
            goto L33
        L1e:
            java.lang.String r0 = com.google.android.exoplayer2.util.l0.getAudioMediaMimeType(r5)
            if (r0 == 0) goto L26
        L24:
            r0 = r6
            goto L33
        L26:
            if (r4 != r8) goto L1c
            if (r3 == r8) goto L2b
            goto L1c
        L2b:
            if (r2 != r8) goto L24
            int r0 = r13.B
            if (r0 == r8) goto L32
            goto L24
        L32:
            r0 = r8
        L33:
            r5 = 1232348160(0x49742400, float:1000000.0)
            r9 = 2132017383(0x7f1400e7, float:1.9673043E38)
            java.lang.String r10 = ""
            android.content.res.Resources r11 = r12.f28224a
            if (r0 != r7) goto L77
            java.lang.String r13 = r12.b(r13)
            if (r4 == r8) goto L5c
            if (r3 != r8) goto L48
            goto L5c
        L48:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            r2 = 2132017385(0x7f1400e9, float:1.9673047E38)
            java.lang.String r0 = r11.getString(r2, r0)
            goto L5d
        L5c:
            r0 = r10
        L5d:
            if (r1 != r8) goto L60
            goto L6e
        L60:
            float r1 = (float) r1
            float r1 = r1 / r5
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r10 = r11.getString(r9, r1)
        L6e:
            java.lang.String[] r13 = new java.lang.String[]{r13, r0, r10}
            java.lang.String r13 = r12.c(r13)
            goto Ld7
        L77:
            if (r0 != r6) goto Ld3
            java.lang.String r13 = r12.a(r13)
            if (r2 == r8) goto Lb8
            if (r2 >= r6) goto L82
            goto Lb8
        L82:
            if (r2 == r6) goto Lb0
            if (r2 == r7) goto La8
            r0 = 6
            if (r2 == r0) goto La0
            r0 = 7
            if (r2 == r0) goto La0
            r0 = 8
            if (r2 == r0) goto L98
            r0 = 2132017396(0x7f1400f4, float:1.967307E38)
            java.lang.String r0 = r11.getString(r0)
            goto Lb9
        L98:
            r0 = 2132017398(0x7f1400f6, float:1.9673073E38)
            java.lang.String r0 = r11.getString(r0)
            goto Lb9
        La0:
            r0 = 2132017397(0x7f1400f5, float:1.9673071E38)
            java.lang.String r0 = r11.getString(r0)
            goto Lb9
        La8:
            r0 = 2132017395(0x7f1400f3, float:1.9673067E38)
            java.lang.String r0 = r11.getString(r0)
            goto Lb9
        Lb0:
            r0 = 2132017384(0x7f1400e8, float:1.9673045E38)
            java.lang.String r0 = r11.getString(r0)
            goto Lb9
        Lb8:
            r0 = r10
        Lb9:
            if (r1 != r8) goto Lbc
            goto Lca
        Lbc:
            float r1 = (float) r1
            float r1 = r1 / r5
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r10 = r11.getString(r9, r1)
        Lca:
            java.lang.String[] r13 = new java.lang.String[]{r13, r0, r10}
            java.lang.String r13 = r12.c(r13)
            goto Ld7
        Ld3:
            java.lang.String r13 = r12.a(r13)
        Ld7:
            int r0 = r13.length()
            if (r0 != 0) goto Le4
            r13 = 2132017399(0x7f1400f7, float:1.9673075E38)
            java.lang.String r13 = r11.getString(r13)
        Le4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.i.getTrackName(com.google.android.exoplayer2.z0):java.lang.String");
    }
}

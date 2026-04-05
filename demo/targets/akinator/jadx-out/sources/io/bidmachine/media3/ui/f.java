package io.bidmachine.media3.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f61752a;

    public f(Resources resources) {
        this.f61752a = (Resources) io.bidmachine.media3.common.util.a.checkNotNull(resources);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(io.bidmachine.media3.common.b r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            java.lang.String r0 = r8.f60654d
            java.lang.String r1 = r8.f60652b
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = ""
            if (r2 != 0) goto L27
            java.lang.String r2 = "und"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L15
            goto L27
        L15:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            java.util.Locale r2 = io.bidmachine.media3.common.util.a1.getDefaultDisplayLocale()
            java.lang.String r0 = r0.getDisplayName(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L29
        L27:
            r0 = r3
            goto L4a
        L29:
            r4 = 1
            r5 = 0
            int r4 = r0.offsetByCodePoints(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            r6.<init>()     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r5 = r0.substring(r5, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r2 = r5.toUpperCase(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r2 = r0.substring(r4)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            r6.append(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L4a
            java.lang.String r0 = r6.toString()     // Catch: java.lang.IndexOutOfBoundsException -> L4a
        L4a:
            java.lang.String r8 = r7.b(r8)
            java.lang.String[] r8 = new java.lang.String[]{r0, r8}
            java.lang.String r8 = r7.c(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L64
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            if (r8 == 0) goto L63
            r1 = r3
        L63:
            r8 = r1
        L64:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.f.a(io.bidmachine.media3.common.b):java.lang.String");
    }

    public final String b(io.bidmachine.media3.common.b bVar) throws Resources.NotFoundException {
        int i10 = bVar.f60656f;
        int i11 = i10 & 2;
        Resources resources = this.f61752a;
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
                string = TextUtils.isEmpty(string) ? str : this.f61752a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // io.bidmachine.media3.ui.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getTrackName(io.bidmachine.media3.common.b r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.ui.f.getTrackName(io.bidmachine.media3.common.b):java.lang.String");
    }
}

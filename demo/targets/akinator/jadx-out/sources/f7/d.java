package f7;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f55456a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.o f55457b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements h {
        @Override // f7.h
        public i create(Uri uri, l7.o oVar, a7.m mVar) {
            if (e0.areEqual(uri.getScheme(), "content")) {
                return new d(uri, oVar);
            }
            return null;
        }
    }

    public d(Uri uri, l7.o oVar) {
        this.f55456a = uri;
        this.f55457b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // f7.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object fetch(zu.d<? super f7.g> r9) throws java.io.FileNotFoundException {
        /*
            r8 = this;
            l7.o r9 = r8.f55457b
            android.content.Context r0 = r9.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = r8.f55456a
            boolean r2 = r8.isContactPhotoUri$coil_base_release(r1)
            java.lang.String r3 = "'."
            r4 = 0
            if (r2 == 0) goto L40
            java.lang.String r2 = "r"
            android.content.res.AssetFileDescriptor r2 = r0.openAssetFileDescriptor(r1, r2)
            if (r2 == 0) goto L21
            java.io.FileInputStream r4 = r2.createInputStream()
        L21:
            if (r4 == 0) goto L25
            goto Lb6
        L25:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to find a contact photo associated with '"
            r9.<init>(r0)
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L40:
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r2 < r5) goto Lb0
            boolean r2 = r8.isMusicThumbnailUri$coil_base_release(r1)
            if (r2 == 0) goto Lb0
            m7.j r2 = r9.getSize()
            m7.c r2 = r2.getWidth()
            boolean r5 = r2 instanceof m7.c.a
            if (r5 == 0) goto L5b
            m7.c$a r2 = (m7.c.a) r2
            goto L5c
        L5b:
            r2 = r4
        L5c:
            if (r2 == 0) goto L85
            int r2 = r2.f74052a
            m7.j r5 = r9.getSize()
            m7.c r5 = r5.getHeight()
            boolean r6 = r5 instanceof m7.c.a
            if (r6 == 0) goto L6f
            m7.c$a r5 = (m7.c.a) r5
            goto L70
        L6f:
            r5 = r4
        L70:
            if (r5 == 0) goto L85
            int r5 = r5.f74052a
            android.os.Bundle r6 = new android.os.Bundle
            r7 = 1
            r6.<init>(r7)
            android.graphics.Point r7 = new android.graphics.Point
            r7.<init>(r2, r5)
            java.lang.String r2 = "android.content.extra.SIZE"
            r6.putParcelable(r2, r7)
            goto L86
        L85:
            r6 = r4
        L86:
            java.lang.String r2 = "image/*"
            android.content.res.AssetFileDescriptor r2 = r0.openTypedAssetFile(r1, r2, r6, r4)
            if (r2 == 0) goto L92
            java.io.FileInputStream r4 = r2.createInputStream()
        L92:
            if (r4 == 0) goto L95
            goto Lb6
        L95:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to find a music thumbnail associated with '"
            r9.<init>(r0)
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Lb0:
            java.io.InputStream r4 = r0.openInputStream(r1)
            if (r4 == 0) goto Ld7
        Lb6:
            f7.o r2 = new f7.o
            pw.b1 r3 = pw.h0.source(r4)
            pw.k r3 = pw.h0.buffer(r3)
            android.content.Context r9 = r9.getContext()
            c7.e r4 = new c7.e
            r4.<init>(r1)
            c7.s r9 = c7.t.create(r3, r9, r4)
            java.lang.String r0 = r0.getType(r1)
            c7.f r1 = c7.f.f11835e
            r2.<init>(r9, r0, r1)
            return r2
        Ld7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to open '"
            r9.<init>(r0)
            r9.append(r1)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.d.fetch(zu.d):java.lang.Object");
    }

    public final boolean isContactPhotoUri$coil_base_release(Uri uri) {
        return e0.areEqual(uri.getAuthority(), "com.android.contacts") && e0.areEqual(uri.getLastPathSegment(), "display_photo");
    }

    public final boolean isMusicThumbnailUri$coil_base_release(Uri uri) {
        List<String> pathSegments;
        int size;
        return e0.areEqual(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && e0.areEqual(pathSegments.get(size + (-3)), "audio") && e0.areEqual(pathSegments.get(size + (-2)), "albums");
    }
}

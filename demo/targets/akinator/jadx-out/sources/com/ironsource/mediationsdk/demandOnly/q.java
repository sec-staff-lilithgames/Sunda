package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.demandOnly.h;
import com.ironsource.mediationsdk.logger.IronSourceError;
import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface q {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f37490a;

        public a(String adFormat) {
            e0.checkNotNullParameter(adFormat, "adFormat");
            this.f37490a = adFormat;
        }

        public final IronSourceError a(h loadParams) {
            e0.checkNotNullParameter(loadParams, "loadParams");
            h.b bVar = (h.b) loadParams;
            if (bVar.f() == null) {
                return new IronSourceError(1060, o2.l(this.f37490a, " was initialized and loaded without Activity"));
            }
            if (bVar.g() == null) {
                return new IronSourceError(510, "Missing banner layout");
            }
            if (bVar.g().isDestroyed()) {
                return new IronSourceError(510, "Banner layout is destroyed");
            }
            ISBannerSize size = bVar.g().getSize();
            if (size == null) {
                return new IronSourceError(510, "Missing banner size");
            }
            if (com.ironsource.mediationsdk.l.f37559f == size.getDescription() && (size.getHeight() <= 0 || size.getWidth() <= 0)) {
                return new IronSourceError(510, "Unsupported banner size. Height and width must be bigger than 0");
            }
            if (bVar.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = bVar.b();
            if ((strB == null || strB.length() == 0) && loadParams.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f37491a;

        public b(String adFormat) {
            e0.checkNotNullParameter(adFormat, "adFormat");
            this.f37491a = adFormat;
        }

        public final IronSourceError a(h.d loadParams) {
            e0.checkNotNullParameter(loadParams, "loadParams");
            if (loadParams.d() == null) {
                return new IronSourceError(1060, o2.l(this.f37491a, " was initialized and loaded without Activity"));
            }
            if (loadParams.e() == null) {
                return new IronSourceError(510, "Missing instance Id");
            }
            String strB = loadParams.b();
            if ((strB == null || strB.length() == 0) && loadParams.c()) {
                return new IronSourceError(510, "Missing adm");
            }
            return null;
        }
    }

    IronSourceError a();
}

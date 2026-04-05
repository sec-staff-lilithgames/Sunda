package com.vungle.ads.internal.downloader;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Downloader {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface NetworkType {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static int CELLULAR = 1;
            private static int WIFI = 2;
            private static int ANY = 3;

            private Companion() {
            }

            public final int getANY() {
                return ANY;
            }

            public final int getCELLULAR() {
                return CELLULAR;
            }

            public final int getWIFI() {
                return WIFI;
            }

            public final void setANY(int i10) {
                ANY = i10;
            }

            public final void setCELLULAR(int i10) {
                CELLULAR = i10;
            }

            public final void setWIFI(int i10) {
                WIFI = i10;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class RequestException extends Exception {
        public RequestException(String str) {
            super(str);
        }
    }

    void cancel(DownloadRequest downloadRequest);

    void cancelAll();

    void download(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener);
}

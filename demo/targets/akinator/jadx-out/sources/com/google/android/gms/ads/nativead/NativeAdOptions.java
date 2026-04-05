package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.VideoOptions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;
    private final boolean zza;
    private final int zzb;
    private final boolean zzc;
    private final int zzd;
    private final VideoOptions zze;
    private final boolean zzf;
    private final boolean zzg;
    private final int zzh;
    private final int zzi;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        private VideoOptions zzd;
        private boolean zza = false;
        private int zzb = 0;
        private boolean zzc = false;
        private int zze = 1;
        private boolean zzf = false;
        private boolean zzg = false;
        private int zzh = 0;
        private int zzi = 1;

        public NativeAdOptions build() {
            return new NativeAdOptions(this, null);
        }

        public Builder enableCustomClickGestureDirection(int i10, boolean z10) {
            this.zzg = z10;
            this.zzh = i10;
            return this;
        }

        public Builder setAdChoicesPlacement(int i10) {
            this.zze = i10;
            return this;
        }

        public Builder setMediaAspectRatio(int i10) {
            this.zzb = i10;
            return this;
        }

        public Builder setRequestCustomMuteThisAd(boolean z10) {
            this.zzf = z10;
            return this;
        }

        public Builder setRequestMultipleImages(boolean z10) {
            this.zzc = z10;
            return this;
        }

        public Builder setReturnUrlsForImageAssets(boolean z10) {
            this.zza = z10;
            return this;
        }

        public Builder setVideoOptions(VideoOptions videoOptions) {
            this.zzd = videoOptions;
            return this;
        }

        public final /* synthetic */ boolean zza() {
            return this.zza;
        }

        public final /* synthetic */ int zzb() {
            return this.zzb;
        }

        public final /* synthetic */ boolean zzc() {
            return this.zzc;
        }

        public final /* synthetic */ VideoOptions zzd() {
            return this.zzd;
        }

        public final /* synthetic */ int zze() {
            return this.zze;
        }

        public final /* synthetic */ boolean zzf() {
            return this.zzf;
        }

        public final /* synthetic */ boolean zzg() {
            return this.zzg;
        }

        public final /* synthetic */ int zzh() {
            return this.zzh;
        }

        public final Builder zzi(int i10) {
            this.zzi = i10;
            return this;
        }

        public final /* synthetic */ int zzj() {
            return this.zzi;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public @interface NativeMediaAspectRatio {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
        this.zzc = builder.zzc();
        this.zzd = builder.zze();
        this.zze = builder.zzd();
        this.zzf = builder.zzf();
        this.zzg = builder.zzg();
        this.zzh = builder.zzh();
        this.zzi = builder.zzj();
    }

    public int getAdChoicesPlacement() {
        return this.zzd;
    }

    public int getMediaAspectRatio() {
        return this.zzb;
    }

    public VideoOptions getVideoOptions() {
        return this.zze;
    }

    public boolean shouldRequestMultipleImages() {
        return this.zzc;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.zza;
    }

    public final boolean zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final boolean zzc() {
        return this.zzg;
    }

    public final int zzd() {
        return this.zzi;
    }
}

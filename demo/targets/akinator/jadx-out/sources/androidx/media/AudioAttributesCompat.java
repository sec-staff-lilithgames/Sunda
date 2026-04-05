package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AudioAttributesCompat implements g6.i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f6762b;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f6763a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public AudioAttributesCompat() {
    }

    public static int a(int i10, int i11, boolean z10) {
        if ((i10 & 1) == 1) {
            if (!z10) {
                return 7;
            }
        } else {
            if ((i10 & 4) == 4) {
                return z10 ? 0 : 6;
            }
            switch (i11) {
                case 0:
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return z10 ? 0 : 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    break;
                case 15:
                default:
                    if (z10) {
                        throw new IllegalArgumentException(o2.k(i11, "Unknown usage value ", " in audio attributes"));
                    }
                    return 3;
            }
        }
        return 1;
    }

    public static void setForceLegacyBehavior(boolean z10) {
        f6762b = z10;
    }

    public static AudioAttributesCompat wrap(Object obj) {
        if (f6762b) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 26 ? new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj, 0)) : new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj, 0));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f6763a;
        return audioAttributesImpl == null ? audioAttributesCompat.f6763a == null : audioAttributesImpl.equals(audioAttributesCompat.f6763a);
    }

    public int getContentType() {
        return this.f6763a.getContentType();
    }

    public int getFlags() {
        return this.f6763a.getFlags();
    }

    public int getLegacyStreamType() {
        return this.f6763a.getLegacyStreamType();
    }

    public int getUsage() {
        return this.f6763a.getUsage();
    }

    public int getVolumeControlStream() {
        return this.f6763a.getVolumeControlStream();
    }

    public int hashCode() {
        return this.f6763a.hashCode();
    }

    public String toString() {
        return this.f6763a.toString();
    }

    public Object unwrap() {
        return this.f6763a.getAudioAttributes();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f6763a = audioAttributesImpl;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media.a f6764a;

        public a() {
            if (!AudioAttributesCompat.f6762b) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f6764a = new c();
                    return;
                } else {
                    this.f6764a = new b();
                    return;
                }
            }
            d dVar = new d();
            dVar.f6798a = 0;
            dVar.f6799b = 0;
            dVar.f6800c = 0;
            dVar.f6801d = -1;
            this.f6764a = dVar;
        }

        public AudioAttributesCompat build() {
            return new AudioAttributesCompat(this.f6764a.build());
        }

        public a setContentType(int i10) {
            this.f6764a.setContentType(i10);
            return this;
        }

        public a setFlags(int i10) {
            this.f6764a.setFlags(i10);
            return this;
        }

        public a setLegacyStreamType(int i10) {
            this.f6764a.setLegacyStreamType(i10);
            return this;
        }

        public a setUsage(int i10) {
            this.f6764a.setUsage(i10);
            return this;
        }

        public a(AudioAttributesCompat audioAttributesCompat) {
            if (AudioAttributesCompat.f6762b) {
                d dVar = new d();
                dVar.f6798a = 0;
                dVar.f6799b = 0;
                dVar.f6800c = 0;
                dVar.f6801d = -1;
                dVar.f6798a = audioAttributesCompat.getUsage();
                dVar.f6799b = audioAttributesCompat.getContentType();
                dVar.f6800c = audioAttributesCompat.getFlags();
                dVar.f6801d = audioAttributesCompat.f6763a.getRawLegacyStreamType();
                this.f6764a = dVar;
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                this.f6764a = new c(audioAttributesCompat.unwrap());
            } else {
                this.f6764a = new b(audioAttributesCompat.unwrap());
            }
        }
    }
}

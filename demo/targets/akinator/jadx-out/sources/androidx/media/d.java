package androidx.media;

import android.util.Log;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public int f6798a;

    /* renamed from: b, reason: collision with root package name */
    public int f6799b;

    /* renamed from: c, reason: collision with root package name */
    public int f6800c;

    /* renamed from: d, reason: collision with root package name */
    public int f6801d;

    @Override // androidx.media.a
    public AudioAttributesImpl build() {
        int i10 = this.f6799b;
        int i11 = this.f6800c;
        int i12 = this.f6798a;
        int i13 = this.f6801d;
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f6768b = i10;
        audioAttributesImplBase.f6769c = i11;
        audioAttributesImplBase.f6767a = i12;
        audioAttributesImplBase.f6770d = i13;
        return audioAttributesImplBase;
    }

    @Override // androidx.media.a
    public d setContentType(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            this.f6799b = i10;
            return this;
        }
        this.f6799b = 0;
        return this;
    }

    @Override // androidx.media.a
    public d setFlags(int i10) {
        this.f6800c = (i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) | this.f6800c;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media.a
    public d setLegacyStreamType(int i10) {
        if (i10 == 10) {
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }
        this.f6801d = i10;
        int i11 = 2;
        switch (i10) {
            case 0:
                this.f6799b = 1;
                break;
            case 1:
                this.f6799b = 4;
                break;
            case 2:
                this.f6799b = 4;
                break;
            case 3:
                this.f6799b = 2;
                break;
            case 4:
                this.f6799b = 4;
                break;
            case 5:
                this.f6799b = 4;
                break;
            case 6:
                this.f6799b = 1;
                this.f6800c |= 4;
                break;
            case 7:
                this.f6800c |= 1;
                this.f6799b = 4;
                break;
            case 8:
                this.f6799b = 4;
                break;
            case 9:
                this.f6799b = 4;
                break;
            case 10:
                this.f6799b = 1;
                break;
            default:
                Log.e("AudioAttributesCompat", "Invalid stream type " + i10 + " for AudioAttributesCompat");
                break;
        }
        switch (i10) {
            case 0:
            case 6:
                break;
            case 1:
            case 7:
                i11 = 13;
                break;
            case 2:
                i11 = 6;
                break;
            case 3:
                i11 = 1;
                break;
            case 4:
                i11 = 4;
                break;
            case 5:
                i11 = 5;
                break;
            case 8:
                i11 = 3;
                break;
            case 9:
            default:
                i11 = 0;
                break;
            case 10:
                i11 = 11;
                break;
        }
        this.f6798a = i11;
        return this;
    }

    @Override // androidx.media.a
    public d setUsage(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                this.f6798a = i10;
                break;
            case 16:
                this.f6798a = 12;
                break;
            default:
                this.f6798a = 0;
                break;
        }
        return this;
    }
}

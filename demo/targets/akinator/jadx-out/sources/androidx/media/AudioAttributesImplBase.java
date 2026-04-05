package androidx.media;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f6767a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f6768b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f6769c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f6770d = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f6768b == audioAttributesImplBase.getContentType() && this.f6769c == audioAttributesImplBase.getFlags() && this.f6767a == audioAttributesImplBase.getUsage() && this.f6770d == audioAttributesImplBase.f6770d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object getAudioAttributes() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.f6768b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i10 = this.f6769c;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i10 |= 4;
        } else if (legacyStreamType == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i10 = this.f6770d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(this.f6769c, this.f6767a, false);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.f6770d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.f6767a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return AudioAttributesCompat.a(this.f6769c, this.f6767a, true);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6768b), Integer.valueOf(this.f6769c), Integer.valueOf(this.f6767a), Integer.valueOf(this.f6770d)});
    }

    public String toString() {
        String strE;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f6770d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f6770d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f6767a;
        boolean z10 = AudioAttributesCompat.f6762b;
        switch (i10) {
            case 0:
                strE = "USAGE_UNKNOWN";
                break;
            case 1:
                strE = "USAGE_MEDIA";
                break;
            case 2:
                strE = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strE = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strE = "USAGE_ALARM";
                break;
            case 5:
                strE = "USAGE_NOTIFICATION";
                break;
            case 6:
                strE = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strE = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strE = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strE = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strE = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strE = "USAGE_GAME";
                break;
            case 15:
            default:
                strE = a.b.e(i10, "unknown usage ");
                break;
            case 16:
                strE = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strE);
        sb2.append(" content=");
        sb2.append(this.f6768b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f6769c).toUpperCase());
        return sb2.toString();
    }
}

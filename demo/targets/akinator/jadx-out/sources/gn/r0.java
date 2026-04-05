package gn;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 {
    public CharSequence A;
    public Integer B;
    public Integer C;
    public CharSequence D;
    public CharSequence E;
    public CharSequence F;
    public Integer G;
    public Bundle H;
    public b5 I = b5.of();

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f58077a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f58078b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f58079c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f58080d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f58081e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f58082f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f58083g;

    /* renamed from: h, reason: collision with root package name */
    public Long f58084h;

    /* renamed from: i, reason: collision with root package name */
    public m1 f58085i;

    /* renamed from: j, reason: collision with root package name */
    public m1 f58086j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f58087k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f58088l;

    /* renamed from: m, reason: collision with root package name */
    public Uri f58089m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f58090n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f58091o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f58092p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f58093q;

    /* renamed from: r, reason: collision with root package name */
    public Boolean f58094r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f58095s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f58096t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f58097u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f58098v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f58099w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f58100x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f58101y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f58102z;

    public s0 build() {
        return new s0(this);
    }

    public r0 maybeSetArtworkData(byte[] bArr, int i10) {
        if (this.f58087k != null && i10 != 3 && Objects.equals(this.f58088l, 3)) {
            return this;
        }
        this.f58087k = (byte[]) bArr.clone();
        this.f58088l = Integer.valueOf(i10);
        return this;
    }

    public r0 populate(s0 s0Var) {
        if (s0Var != null) {
            b5 b5Var = s0Var.J;
            byte[] bArr = s0Var.f58145k;
            CharSequence charSequence = s0Var.f58135a;
            if (charSequence != null) {
                setTitle(charSequence);
            }
            CharSequence charSequence2 = s0Var.f58136b;
            if (charSequence2 != null) {
                setArtist(charSequence2);
            }
            CharSequence charSequence3 = s0Var.f58137c;
            if (charSequence3 != null) {
                setAlbumTitle(charSequence3);
            }
            CharSequence charSequence4 = s0Var.f58138d;
            if (charSequence4 != null) {
                setAlbumArtist(charSequence4);
            }
            CharSequence charSequence5 = s0Var.f58139e;
            if (charSequence5 != null) {
                setDisplayTitle(charSequence5);
            }
            CharSequence charSequence6 = s0Var.f58140f;
            if (charSequence6 != null) {
                setSubtitle(charSequence6);
            }
            CharSequence charSequence7 = s0Var.f58141g;
            if (charSequence7 != null) {
                setDescription(charSequence7);
            }
            Long l9 = s0Var.f58142h;
            if (l9 != null) {
                setDurationMs(l9);
            }
            m1 m1Var = s0Var.f58143i;
            if (m1Var != null) {
                setUserRating(m1Var);
            }
            m1 m1Var2 = s0Var.f58144j;
            if (m1Var2 != null) {
                setOverallRating(m1Var2);
            }
            Uri uri = s0Var.f58147m;
            if (uri != null || bArr != null) {
                setArtworkUri(uri);
                setArtworkData(bArr, s0Var.f58146l);
            }
            Integer num = s0Var.f58148n;
            if (num != null) {
                setTrackNumber(num);
            }
            Integer num2 = s0Var.f58149o;
            if (num2 != null) {
                setTotalTrackCount(num2);
            }
            Integer num3 = s0Var.f58150p;
            if (num3 != null) {
                setFolderType(num3);
            }
            Boolean bool = s0Var.f58151q;
            if (bool != null) {
                setIsBrowsable(bool);
            }
            Boolean bool2 = s0Var.f58152r;
            if (bool2 != null) {
                setIsPlayable(bool2);
            }
            Integer num4 = s0Var.f58153s;
            if (num4 != null) {
                setRecordingYear(num4);
            }
            Integer num5 = s0Var.f58154t;
            if (num5 != null) {
                setRecordingYear(num5);
            }
            Integer num6 = s0Var.f58155u;
            if (num6 != null) {
                setRecordingMonth(num6);
            }
            Integer num7 = s0Var.f58156v;
            if (num7 != null) {
                setRecordingDay(num7);
            }
            Integer num8 = s0Var.f58157w;
            if (num8 != null) {
                setReleaseYear(num8);
            }
            Integer num9 = s0Var.f58158x;
            if (num9 != null) {
                setReleaseMonth(num9);
            }
            Integer num10 = s0Var.f58159y;
            if (num10 != null) {
                setReleaseDay(num10);
            }
            CharSequence charSequence8 = s0Var.f58160z;
            if (charSequence8 != null) {
                setWriter(charSequence8);
            }
            CharSequence charSequence9 = s0Var.A;
            if (charSequence9 != null) {
                setComposer(charSequence9);
            }
            CharSequence charSequence10 = s0Var.B;
            if (charSequence10 != null) {
                setConductor(charSequence10);
            }
            Integer num11 = s0Var.C;
            if (num11 != null) {
                setDiscNumber(num11);
            }
            Integer num12 = s0Var.D;
            if (num12 != null) {
                setTotalDiscCount(num12);
            }
            CharSequence charSequence11 = s0Var.E;
            if (charSequence11 != null) {
                setGenre(charSequence11);
            }
            CharSequence charSequence12 = s0Var.F;
            if (charSequence12 != null) {
                setCompilation(charSequence12);
            }
            CharSequence charSequence13 = s0Var.G;
            if (charSequence13 != null) {
                setStation(charSequence13);
            }
            Integer num13 = s0Var.H;
            if (num13 != null) {
                setMediaType(num13);
            }
            Bundle bundle = s0Var.I;
            if (bundle != null) {
                setExtras(bundle);
            }
            if (!b5Var.isEmpty()) {
                setSupportedCommands(b5Var);
            }
        }
        return this;
    }

    public r0 populateFromMetadata(u0 u0Var) {
        for (int i10 = 0; i10 < u0Var.length(); i10++) {
            u0Var.get(i10).populateMediaMetadata(this);
        }
        return this;
    }

    public r0 setAlbumArtist(CharSequence charSequence) {
        this.f58080d = charSequence;
        return this;
    }

    public r0 setAlbumTitle(CharSequence charSequence) {
        this.f58079c = charSequence;
        return this;
    }

    public r0 setArtist(CharSequence charSequence) {
        this.f58078b = charSequence;
        return this;
    }

    @Deprecated
    public r0 setArtworkData(byte[] bArr) {
        return setArtworkData(bArr, null);
    }

    public r0 setArtworkUri(Uri uri) {
        this.f58089m = uri;
        return this;
    }

    public r0 setCompilation(CharSequence charSequence) {
        this.E = charSequence;
        return this;
    }

    public r0 setComposer(CharSequence charSequence) {
        this.f58102z = charSequence;
        return this;
    }

    public r0 setConductor(CharSequence charSequence) {
        this.A = charSequence;
        return this;
    }

    public r0 setDescription(CharSequence charSequence) {
        this.f58083g = charSequence;
        return this;
    }

    public r0 setDiscNumber(Integer num) {
        this.B = num;
        return this;
    }

    public r0 setDisplayTitle(CharSequence charSequence) {
        this.f58081e = charSequence;
        return this;
    }

    public r0 setDurationMs(Long l9) {
        io.bidmachine.media3.common.util.a.checkArgument(l9 == null || l9.longValue() >= 0);
        this.f58084h = l9;
        return this;
    }

    public r0 setExtras(Bundle bundle) {
        this.H = bundle;
        return this;
    }

    @Deprecated
    public r0 setFolderType(Integer num) {
        this.f58092p = num;
        return this;
    }

    public r0 setGenre(CharSequence charSequence) {
        this.D = charSequence;
        return this;
    }

    public r0 setIsBrowsable(Boolean bool) {
        this.f58093q = bool;
        return this;
    }

    public r0 setIsPlayable(Boolean bool) {
        this.f58094r = bool;
        return this;
    }

    public r0 setMediaType(Integer num) {
        this.G = num;
        return this;
    }

    public r0 setOverallRating(m1 m1Var) {
        this.f58086j = m1Var;
        return this;
    }

    public r0 setRecordingDay(Integer num) {
        this.f58097u = num;
        return this;
    }

    public r0 setRecordingMonth(Integer num) {
        this.f58096t = num;
        return this;
    }

    public r0 setRecordingYear(Integer num) {
        this.f58095s = num;
        return this;
    }

    public r0 setReleaseDay(Integer num) {
        this.f58100x = num;
        return this;
    }

    public r0 setReleaseMonth(Integer num) {
        this.f58099w = num;
        return this;
    }

    public r0 setReleaseYear(Integer num) {
        this.f58098v = num;
        return this;
    }

    public r0 setStation(CharSequence charSequence) {
        this.F = charSequence;
        return this;
    }

    public r0 setSubtitle(CharSequence charSequence) {
        this.f58082f = charSequence;
        return this;
    }

    public r0 setSupportedCommands(List<String> list) {
        this.I = b5.copyOf((Collection) list);
        return this;
    }

    public r0 setTitle(CharSequence charSequence) {
        this.f58077a = charSequence;
        return this;
    }

    public r0 setTotalDiscCount(Integer num) {
        this.C = num;
        return this;
    }

    public r0 setTotalTrackCount(Integer num) {
        this.f58091o = num;
        return this;
    }

    public r0 setTrackNumber(Integer num) {
        this.f58090n = num;
        return this;
    }

    public r0 setUserRating(m1 m1Var) {
        this.f58085i = m1Var;
        return this;
    }

    public r0 setWriter(CharSequence charSequence) {
        this.f58101y = charSequence;
        return this;
    }

    @Deprecated
    public r0 setYear(Integer num) {
        return setRecordingYear(num);
    }

    public r0 setArtworkData(byte[] bArr, Integer num) {
        this.f58087k = bArr == null ? null : (byte[]) bArr.clone();
        this.f58088l = num;
        return this;
    }

    public r0 populateFromMetadata(List<u0> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            u0 u0Var = list.get(i10);
            for (int i11 = 0; i11 < u0Var.length(); i11++) {
                u0Var.get(i11).populateMediaMetadata(this);
            }
        }
        return this;
    }
}

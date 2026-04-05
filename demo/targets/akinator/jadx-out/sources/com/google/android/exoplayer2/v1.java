package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v1 {
    public Integer A;
    public Integer B;
    public CharSequence C;
    public CharSequence D;
    public CharSequence E;
    public Integer F;
    public Bundle G;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f28604a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f28605b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f28606c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f28607d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f28608e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f28609f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f28610g;

    /* renamed from: h, reason: collision with root package name */
    public x2 f28611h;

    /* renamed from: i, reason: collision with root package name */
    public x2 f28612i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f28613j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f28614k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f28615l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f28616m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f28617n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f28618o;

    /* renamed from: p, reason: collision with root package name */
    public Boolean f28619p;

    /* renamed from: q, reason: collision with root package name */
    public Boolean f28620q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f28621r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f28622s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f28623t;

    /* renamed from: u, reason: collision with root package name */
    public Integer f28624u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f28625v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f28626w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f28627x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f28628y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f28629z;

    public w1 build() {
        return new w1(this);
    }

    public v1 maybeSetArtworkData(byte[] bArr, int i10) {
        if (this.f28613j != null && !com.google.android.exoplayer2.util.n1.areEqual(Integer.valueOf(i10), 3) && com.google.android.exoplayer2.util.n1.areEqual(this.f28614k, 3)) {
            return this;
        }
        this.f28613j = (byte[]) bArr.clone();
        this.f28614k = Integer.valueOf(i10);
        return this;
    }

    public v1 populate(w1 w1Var) {
        if (w1Var != null) {
            CharSequence charSequence = w1Var.f28663b;
            if (charSequence != null) {
                setTitle(charSequence);
            }
            CharSequence charSequence2 = w1Var.f28664c;
            if (charSequence2 != null) {
                setArtist(charSequence2);
            }
            CharSequence charSequence3 = w1Var.f28665e;
            if (charSequence3 != null) {
                setAlbumTitle(charSequence3);
            }
            CharSequence charSequence4 = w1Var.f28666f;
            if (charSequence4 != null) {
                setAlbumArtist(charSequence4);
            }
            CharSequence charSequence5 = w1Var.f28667g;
            if (charSequence5 != null) {
                setDisplayTitle(charSequence5);
            }
            CharSequence charSequence6 = w1Var.f28668h;
            if (charSequence6 != null) {
                setSubtitle(charSequence6);
            }
            CharSequence charSequence7 = w1Var.f28669i;
            if (charSequence7 != null) {
                setDescription(charSequence7);
            }
            x2 x2Var = w1Var.f28670j;
            if (x2Var != null) {
                setUserRating(x2Var);
            }
            x2 x2Var2 = w1Var.f28671k;
            if (x2Var2 != null) {
                setOverallRating(x2Var2);
            }
            byte[] bArr = w1Var.f28672l;
            if (bArr != null) {
                setArtworkData(bArr, w1Var.f28673m);
            }
            Uri uri = w1Var.f28674n;
            if (uri != null) {
                setArtworkUri(uri);
            }
            Integer num = w1Var.f28675o;
            if (num != null) {
                setTrackNumber(num);
            }
            Integer num2 = w1Var.f28676p;
            if (num2 != null) {
                setTotalTrackCount(num2);
            }
            Integer num3 = w1Var.f28677q;
            if (num3 != null) {
                setFolderType(num3);
            }
            Boolean bool = w1Var.f28678r;
            if (bool != null) {
                setIsBrowsable(bool);
            }
            Boolean bool2 = w1Var.f28679s;
            if (bool2 != null) {
                setIsPlayable(bool2);
            }
            Integer num4 = w1Var.f28680t;
            if (num4 != null) {
                setRecordingYear(num4);
            }
            Integer num5 = w1Var.f28681u;
            if (num5 != null) {
                setRecordingYear(num5);
            }
            Integer num6 = w1Var.f28682v;
            if (num6 != null) {
                setRecordingMonth(num6);
            }
            Integer num7 = w1Var.f28683w;
            if (num7 != null) {
                setRecordingDay(num7);
            }
            Integer num8 = w1Var.f28684x;
            if (num8 != null) {
                setReleaseYear(num8);
            }
            Integer num9 = w1Var.f28685y;
            if (num9 != null) {
                setReleaseMonth(num9);
            }
            Integer num10 = w1Var.f28686z;
            if (num10 != null) {
                setReleaseDay(num10);
            }
            CharSequence charSequence8 = w1Var.A;
            if (charSequence8 != null) {
                setWriter(charSequence8);
            }
            CharSequence charSequence9 = w1Var.B;
            if (charSequence9 != null) {
                setComposer(charSequence9);
            }
            CharSequence charSequence10 = w1Var.C;
            if (charSequence10 != null) {
                setConductor(charSequence10);
            }
            Integer num11 = w1Var.D;
            if (num11 != null) {
                setDiscNumber(num11);
            }
            Integer num12 = w1Var.E;
            if (num12 != null) {
                setTotalDiscCount(num12);
            }
            CharSequence charSequence11 = w1Var.F;
            if (charSequence11 != null) {
                setGenre(charSequence11);
            }
            CharSequence charSequence12 = w1Var.G;
            if (charSequence12 != null) {
                setCompilation(charSequence12);
            }
            CharSequence charSequence13 = w1Var.H;
            if (charSequence13 != null) {
                setStation(charSequence13);
            }
            Integer num13 = w1Var.I;
            if (num13 != null) {
                setMediaType(num13);
            }
            Bundle bundle = w1Var.J;
            if (bundle != null) {
                setExtras(bundle);
            }
        }
        return this;
    }

    public v1 populateFromMetadata(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.length(); i10++) {
            metadata.get(i10).populateMediaMetadata(this);
        }
        return this;
    }

    public v1 setAlbumArtist(CharSequence charSequence) {
        this.f28607d = charSequence;
        return this;
    }

    public v1 setAlbumTitle(CharSequence charSequence) {
        this.f28606c = charSequence;
        return this;
    }

    public v1 setArtist(CharSequence charSequence) {
        this.f28605b = charSequence;
        return this;
    }

    @Deprecated
    public v1 setArtworkData(byte[] bArr) {
        return setArtworkData(bArr, null);
    }

    public v1 setArtworkUri(Uri uri) {
        this.f28615l = uri;
        return this;
    }

    public v1 setCompilation(CharSequence charSequence) {
        this.D = charSequence;
        return this;
    }

    public v1 setComposer(CharSequence charSequence) {
        this.f28628y = charSequence;
        return this;
    }

    public v1 setConductor(CharSequence charSequence) {
        this.f28629z = charSequence;
        return this;
    }

    public v1 setDescription(CharSequence charSequence) {
        this.f28610g = charSequence;
        return this;
    }

    public v1 setDiscNumber(Integer num) {
        this.A = num;
        return this;
    }

    public v1 setDisplayTitle(CharSequence charSequence) {
        this.f28608e = charSequence;
        return this;
    }

    public v1 setExtras(Bundle bundle) {
        this.G = bundle;
        return this;
    }

    @Deprecated
    public v1 setFolderType(Integer num) {
        this.f28618o = num;
        return this;
    }

    public v1 setGenre(CharSequence charSequence) {
        this.C = charSequence;
        return this;
    }

    public v1 setIsBrowsable(Boolean bool) {
        this.f28619p = bool;
        return this;
    }

    public v1 setIsPlayable(Boolean bool) {
        this.f28620q = bool;
        return this;
    }

    public v1 setMediaType(Integer num) {
        this.F = num;
        return this;
    }

    public v1 setOverallRating(x2 x2Var) {
        this.f28612i = x2Var;
        return this;
    }

    public v1 setRecordingDay(Integer num) {
        this.f28623t = num;
        return this;
    }

    public v1 setRecordingMonth(Integer num) {
        this.f28622s = num;
        return this;
    }

    public v1 setRecordingYear(Integer num) {
        this.f28621r = num;
        return this;
    }

    public v1 setReleaseDay(Integer num) {
        this.f28626w = num;
        return this;
    }

    public v1 setReleaseMonth(Integer num) {
        this.f28625v = num;
        return this;
    }

    public v1 setReleaseYear(Integer num) {
        this.f28624u = num;
        return this;
    }

    public v1 setStation(CharSequence charSequence) {
        this.E = charSequence;
        return this;
    }

    public v1 setSubtitle(CharSequence charSequence) {
        this.f28609f = charSequence;
        return this;
    }

    public v1 setTitle(CharSequence charSequence) {
        this.f28604a = charSequence;
        return this;
    }

    public v1 setTotalDiscCount(Integer num) {
        this.B = num;
        return this;
    }

    public v1 setTotalTrackCount(Integer num) {
        this.f28617n = num;
        return this;
    }

    public v1 setTrackNumber(Integer num) {
        this.f28616m = num;
        return this;
    }

    public v1 setUserRating(x2 x2Var) {
        this.f28611h = x2Var;
        return this;
    }

    public v1 setWriter(CharSequence charSequence) {
        this.f28627x = charSequence;
        return this;
    }

    @Deprecated
    public v1 setYear(Integer num) {
        return setRecordingYear(num);
    }

    public v1 setArtworkData(byte[] bArr, Integer num) {
        this.f28613j = bArr == null ? null : (byte[]) bArr.clone();
        this.f28614k = num;
        return this;
    }

    public v1 populateFromMetadata(List<Metadata> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Metadata metadata = list.get(i10);
            for (int i11 = 0; i11 < metadata.length(); i11++) {
                metadata.get(i11).populateMediaMetadata(this);
            }
        }
        return this;
    }
}

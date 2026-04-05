package wo;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import gn.t0;
import mh.c;
import p0.o2;
import rh.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f90773a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90774b;

    public b(String str, String str2) {
        this.f90773a = c.toUpperCase(str);
        this.f90774b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f90773a.equals(bVar.f90773a) && this.f90774b.equals(bVar.f90774b)) {
                return true;
            }
        }
        return false;
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return this.f90774b.hashCode() + o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f90773a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gn.t0
    public void populateMediaMetadata(r0 r0Var) {
        String str = this.f90773a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c10 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c10 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c10 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    c10 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    c10 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f90774b;
        switch (c10) {
            case 0:
                Integer numTryParse = w.tryParse(str2);
                if (numTryParse != null) {
                    r0Var.setTotalTrackCount(numTryParse);
                    break;
                }
                break;
            case 1:
                Integer numTryParse2 = w.tryParse(str2);
                if (numTryParse2 != null) {
                    r0Var.setTotalDiscCount(numTryParse2);
                    break;
                }
                break;
            case 2:
                Integer numTryParse3 = w.tryParse(str2);
                if (numTryParse3 != null) {
                    r0Var.setTrackNumber(numTryParse3);
                    break;
                }
                break;
            case 3:
                r0Var.setAlbumTitle(str2);
                break;
            case 4:
                r0Var.setGenre(str2);
                break;
            case 5:
                r0Var.setTitle(str2);
                break;
            case 6:
                r0Var.setDescription(str2);
                break;
            case 7:
                Integer numTryParse4 = w.tryParse(str2);
                if (numTryParse4 != null) {
                    r0Var.setDiscNumber(numTryParse4);
                    break;
                }
                break;
            case '\b':
                r0Var.setAlbumArtist(str2);
                break;
            case '\t':
                r0Var.setArtist(str2);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f90773a + C3191e4.i.f36525b + this.f90774b;
    }
}

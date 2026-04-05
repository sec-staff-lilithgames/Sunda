package yo;

import com.ironsource.mediationsdk.logger.IronSourceError;
import gn.r0;
import io.bidmachine.media3.common.util.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import nh.b5;
import p0.o2;
import rh.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f94748b;

    /* renamed from: c, reason: collision with root package name */
    public final b5 f94749c;

    public n(String str, String str2, List<String> list) {
        super(str);
        io.bidmachine.media3.common.util.a.checkArgument(!list.isEmpty());
        this.f94748b = str2;
        b5 b5VarCopyOf = b5.copyOf((Collection) list);
        this.f94749c = b5VarCopyOf;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f94736a, nVar.f94736a) && Objects.equals(this.f94748b, nVar.f94748b) && this.f94749c.equals(nVar.f94749c)) {
                return true;
            }
        }
        return false;
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // yo.i, gn.t0
    public /* bridge */ /* synthetic */ io.bidmachine.media3.common.b getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f94736a);
        String str = this.f94748b;
        return this.f94749c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yo.i, gn.t0
    public void populateMediaMetadata(r0 r0Var) throws NumberFormatException {
        String str = this.f94736a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 22;
                    break;
                }
                break;
        }
        b5 b5Var = this.f94749c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    r0Var.setAlbumTitle((CharSequence) b5Var.get(0));
                    break;
                case 1:
                case 11:
                    r0Var.setComposer((CharSequence) b5Var.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) b5Var.get(0);
                    r0Var.setRecordingMonth(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    r0Var.setArtist((CharSequence) b5Var.get(0));
                    break;
                case 4:
                case 19:
                    r0Var.setAlbumArtist((CharSequence) b5Var.get(0));
                    break;
                case 5:
                case 20:
                    r0Var.setConductor((CharSequence) b5Var.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrSplit = a1.split((String) b5Var.get(0), "/");
                    r0Var.setTrackNumber(Integer.valueOf(Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 17:
                    r0Var.setTitle((CharSequence) b5Var.get(0));
                    break;
                case '\b':
                case 16:
                    r0Var.setWriter((CharSequence) b5Var.get(0));
                    break;
                case '\t':
                case 22:
                    r0Var.setRecordingYear(Integer.valueOf(Integer.parseInt((String) b5Var.get(0))));
                    break;
                case '\f':
                    Integer numTryParse = w.tryParse((String) b5Var.get(0));
                    if (numTryParse != null) {
                        String strResolveV1Genre = j.resolveV1Genre(numTryParse.intValue());
                        if (strResolveV1Genre != null) {
                            r0Var.setGenre(strResolveV1Genre);
                            break;
                        }
                    } else {
                        r0Var.setGenre((CharSequence) b5Var.get(0));
                        break;
                    }
                    break;
                case 14:
                    ArrayList arrayListA = a((String) b5Var.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                r0Var.setRecordingDay((Integer) arrayListA.get(2));
                            }
                        }
                        r0Var.setRecordingMonth((Integer) arrayListA.get(1));
                    }
                    r0Var.setRecordingYear((Integer) arrayListA.get(0));
                    break;
                case 15:
                    ArrayList arrayListA2 = a((String) b5Var.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                r0Var.setReleaseDay((Integer) arrayListA2.get(2));
                            }
                        }
                        r0Var.setReleaseMonth((Integer) arrayListA2.get(1));
                    }
                    r0Var.setReleaseYear((Integer) arrayListA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // yo.i
    public String toString() {
        return this.f94736a + ": description=" + this.f94748b + ": values=" + this.f94749c;
    }

    @Deprecated
    public n(String str, String str2, String str3) {
        this(str, str2, b5.of(str3));
    }
}

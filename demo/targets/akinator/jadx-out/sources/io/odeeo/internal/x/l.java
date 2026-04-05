package io.odeeo.internal.x;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.odeeo.internal.b.a0;
import io.odeeo.internal.q0.g0;
import java.util.ArrayList;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f67522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67523c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Parcelable.Creator<l> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, String str2, String str3) {
        super(str);
        this.f67522b = str2;
        this.f67523c = str3;
    }

    public static List<Integer> a(String str) {
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
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (g0.areEqual(this.f67511a, lVar.f67511a) && g0.areEqual(this.f67522b, lVar.f67522b) && g0.areEqual(this.f67523c, lVar.f67523c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f67511a);
        String str = this.f67522b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f67523c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.odeeo.internal.x.h, io.odeeo.internal.s.a.b
    public void populateMediaMetadata(a0.b bVar) throws NumberFormatException {
        String str = this.f67511a;
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
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case '\n':
                    bVar.setAlbumTitle(this.f67523c);
                    break;
                case 1:
                case 11:
                    bVar.setComposer(this.f67523c);
                    break;
                case 2:
                case '\f':
                    bVar.setRecordingMonth(Integer.valueOf(Integer.parseInt(this.f67523c.substring(2, 4)))).setRecordingDay(Integer.valueOf(Integer.parseInt(this.f67523c.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.setArtist(this.f67523c);
                    break;
                case 4:
                case 18:
                    bVar.setAlbumArtist(this.f67523c);
                    break;
                case 5:
                case 19:
                    bVar.setConductor(this.f67523c);
                    break;
                case 6:
                case 20:
                    String[] strArrSplit = g0.split(this.f67523c, "/");
                    bVar.setTrackNumber(Integer.valueOf(Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.setTitle(this.f67523c);
                    break;
                case '\b':
                case 15:
                    bVar.setWriter(this.f67523c);
                    break;
                case '\t':
                case 21:
                    bVar.setRecordingYear(Integer.valueOf(Integer.parseInt(this.f67523c)));
                    break;
                case '\r':
                    List<Integer> listA = a(this.f67523c);
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.setRecordingDay(listA.get(2));
                            }
                        }
                        bVar.setRecordingMonth(listA.get(1));
                    }
                    bVar.setRecordingYear(listA.get(0));
                    break;
                case 14:
                    List<Integer> listA2 = a(this.f67523c);
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.setReleaseDay(listA2.get(2));
                            }
                        }
                        bVar.setReleaseMonth(listA2.get(1));
                    }
                    bVar.setReleaseYear(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // io.odeeo.internal.x.h
    public String toString() {
        return this.f67511a + ": description=" + this.f67522b + ": value=" + this.f67523c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f67511a);
        parcel.writeString(this.f67522b);
        parcel.writeString(this.f67523c);
    }

    public l(Parcel parcel) {
        super((String) g0.castNonNull(parcel.readString()));
        this.f67522b = parcel.readString();
        this.f67523c = (String) g0.castNonNull(parcel.readString());
    }
}

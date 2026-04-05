package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.a;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.v1;
import com.google.android.exoplayer2.z0;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nh.b5;
import p0.o2;
import we.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes5.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new l();

    /* renamed from: c, reason: collision with root package name */
    public final String f27774c;

    /* renamed from: e, reason: collision with root package name */
    public final b5 f27775e;

    public TextInformationFrame(String str, String str2, List<String> list) {
        super(str);
        a.checkArgument(!list.isEmpty());
        this.f27774c = str2;
        b5 b5VarCopyOf = b5.copyOf((Collection) list);
        this.f27775e = b5VarCopyOf;
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
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (n1.areEqual(this.f27763b, textInformationFrame.f27763b) && n1.areEqual(this.f27774c, textInformationFrame.f27774c) && this.f27775e.equals(textInformationFrame.f27775e)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* bridge */ /* synthetic */ z0 getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        int iE = o2.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f27763b);
        String str = this.f27774c;
        return this.f27775e.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(v1 v1Var) throws NumberFormatException {
        String str = this.f27763b;
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
        b5 b5Var = this.f27775e;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    v1Var.setAlbumTitle((CharSequence) b5Var.get(0));
                    break;
                case 1:
                case 11:
                    v1Var.setComposer((CharSequence) b5Var.get(0));
                    break;
                case 2:
                case '\f':
                    String str2 = (String) b5Var.get(0);
                    v1Var.setRecordingMonth(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).setRecordingDay(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    v1Var.setArtist((CharSequence) b5Var.get(0));
                    break;
                case 4:
                case 18:
                    v1Var.setAlbumArtist((CharSequence) b5Var.get(0));
                    break;
                case 5:
                case 19:
                    v1Var.setConductor((CharSequence) b5Var.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrSplit = n1.split((String) b5Var.get(0), "/");
                    v1Var.setTrackNumber(Integer.valueOf(Integer.parseInt(strArrSplit[0]))).setTotalTrackCount(strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null);
                    break;
                case 7:
                case 16:
                    v1Var.setTitle((CharSequence) b5Var.get(0));
                    break;
                case '\b':
                case 15:
                    v1Var.setWriter((CharSequence) b5Var.get(0));
                    break;
                case '\t':
                case 21:
                    v1Var.setRecordingYear(Integer.valueOf(Integer.parseInt((String) b5Var.get(0))));
                    break;
                case '\r':
                    ArrayList arrayListA = a((String) b5Var.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                v1Var.setRecordingDay((Integer) arrayListA.get(2));
                            }
                        }
                        v1Var.setRecordingMonth((Integer) arrayListA.get(1));
                    }
                    v1Var.setRecordingYear((Integer) arrayListA.get(0));
                    break;
                case 14:
                    ArrayList arrayListA2 = a((String) b5Var.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                v1Var.setReleaseDay((Integer) arrayListA2.get(2));
                            }
                        }
                        v1Var.setReleaseMonth((Integer) arrayListA2.get(1));
                    }
                    v1Var.setReleaseYear((Integer) arrayListA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f27763b + ": description=" + this.f27774c + ": values=" + this.f27775e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f27763b);
        parcel.writeString(this.f27774c);
        parcel.writeStringArray((String[]) this.f27775e.toArray(new String[0]));
    }

    @Deprecated
    public TextInformationFrame(String str, String str2, String str3) {
        this(str, str2, b5.of(str3));
    }
}

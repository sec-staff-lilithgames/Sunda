package ee;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.util.n1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f54176c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f54177a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f54178b = -1;

    public final boolean a(String str) throws NumberFormatException {
        Matcher matcher = f54176c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) n1.castNonNull(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) n1.castNonNull(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f54177a = i10;
            this.f54178b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean hasGaplessInfo() {
        return (this.f54177a == -1 || this.f54178b == -1) ? false : true;
    }

    public boolean setFromMetadata(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.length(); i10++) {
            Metadata.Entry entry = metadata.get(i10);
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f27757e) && a(commentFrame.f27758f)) {
                    return true;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f27764c) && "iTunSMPB".equals(internalFrame.f27765e) && a(internalFrame.f27766f)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean setFromXingHeaderValue(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f54177a = i11;
        this.f54178b = i12;
        return true;
    }
}

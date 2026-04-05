package np;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import in.i;
import in.j;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.b0;
import java.util.ArrayDeque;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class f {
    public static void applyStylesToSpan(Spannable spannable, int i10, int i11, g gVar, c cVar, Map<String, g> map, int i12) {
        c cVar2;
        g gVarResolveStyle;
        int i13;
        if (gVar.getStyle() != -1) {
            spannable.setSpan(new StyleSpan(gVar.getStyle()), i10, i11, 33);
        }
        if (gVar.isLinethrough()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.isUnderline()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.hasFontColor()) {
            i.addOrReplaceSpan(spannable, new ForegroundColorSpan(gVar.getFontColor()), i10, i11, 33);
        }
        if (gVar.hasBackgroundColor()) {
            i.addOrReplaceSpan(spannable, new BackgroundColorSpan(gVar.getBackgroundColor()), i10, i11, 33);
        }
        if (gVar.getFontFamily() != null) {
            i.addOrReplaceSpan(spannable, new TypefaceSpan(gVar.getFontFamily()), i10, i11, 33);
        }
        if (gVar.getTextEmphasis() != null) {
            b bVar = (b) io.bidmachine.media3.common.util.a.checkNotNull(gVar.getTextEmphasis());
            int i14 = bVar.f77117a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f77118b;
            }
            int i15 = bVar.f77119c;
            if (i15 == -2) {
                i15 = 1;
            }
            i.addOrReplaceSpan(spannable, new j(i14, i13, i15), i10, i11, 33);
        }
        int rubyType = gVar.getRubyType();
        if (rubyType == 2) {
            while (true) {
                cVar2 = null;
                if (cVar == null) {
                    cVar = null;
                    break;
                }
                g gVarResolveStyle2 = resolveStyle(cVar.f77125f, cVar.getStyleIds(), map);
                if (gVarResolveStyle2 != null && gVarResolveStyle2.getRubyType() == 1) {
                    break;
                } else {
                    cVar = cVar.f77129j;
                }
            }
            if (cVar != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(cVar);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    c cVar3 = (c) arrayDeque.pop();
                    g gVarResolveStyle3 = resolveStyle(cVar3.f77125f, cVar3.getStyleIds(), map);
                    if (gVarResolveStyle3 != null && gVarResolveStyle3.getRubyType() == 3) {
                        cVar2 = cVar3;
                        break;
                    }
                    for (int childCount = cVar3.getChildCount() - 1; childCount >= 0; childCount--) {
                        arrayDeque.push(cVar3.getChild(childCount));
                    }
                }
                if (cVar2 != null) {
                    if (cVar2.getChildCount() != 1 || cVar2.getChild(0).f77121b == null) {
                        b0.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = (String) a1.castNonNull(cVar2.getChild(0).f77121b);
                        g gVarResolveStyle4 = resolveStyle(cVar2.f77125f, cVar2.getStyleIds(), map);
                        int rubyPosition = gVarResolveStyle4 != null ? gVarResolveStyle4.getRubyPosition() : -1;
                        if (rubyPosition == -1 && (gVarResolveStyle = resolveStyle(cVar.f77125f, cVar.getStyleIds(), map)) != null) {
                            rubyPosition = gVarResolveStyle.getRubyPosition();
                        }
                        spannable.setSpan(new in.h(str, rubyPosition), i10, i11, 33);
                    }
                }
            }
        } else if (rubyType == 3 || rubyType == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (gVar.getTextCombine()) {
            i.addOrReplaceSpan(spannable, new in.f(), i10, i11, 33);
        }
        int fontSizeUnit = gVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            i.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) gVar.getFontSize(), true), i10, i11, 33);
        } else if (fontSizeUnit == 2) {
            i.addOrReplaceSpan(spannable, new RelativeSizeSpan(gVar.getFontSize()), i10, i11, 33);
        } else {
            if (fontSizeUnit != 3) {
                return;
            }
            i.addInheritedRelativeSizeSpan(spannable, gVar.getFontSize() / 100.0f, i10, i11, 33);
        }
    }

    public static g resolveStyle(g gVar, String[] strArr, Map<String, g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.chain(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.chain(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}

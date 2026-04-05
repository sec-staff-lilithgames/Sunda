package mf;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.n1;
import java.util.ArrayDeque;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g {
    public static void applyStylesToSpan(Spannable spannable, int i10, int i11, h hVar, e eVar, Map<String, h> map, int i12) {
        e eVar2;
        h hVarResolveStyle;
        int i13;
        if (hVar.getStyle() != -1) {
            spannable.setSpan(new StyleSpan(hVar.getStyle()), i10, i11, 33);
        }
        if (hVar.isLinethrough()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (hVar.isUnderline()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (hVar.hasFontColor()) {
            jf.d.addOrReplaceSpan(spannable, new ForegroundColorSpan(hVar.getFontColor()), i10, i11, 33);
        }
        if (hVar.hasBackgroundColor()) {
            jf.d.addOrReplaceSpan(spannable, new BackgroundColorSpan(hVar.getBackgroundColor()), i10, i11, 33);
        }
        if (hVar.getFontFamily() != null) {
            jf.d.addOrReplaceSpan(spannable, new TypefaceSpan(hVar.getFontFamily()), i10, i11, 33);
        }
        if (hVar.getTextEmphasis() != null) {
            b bVar = (b) com.google.android.exoplayer2.util.a.checkNotNull(hVar.getTextEmphasis());
            int i14 = bVar.f74520a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f74521b;
            }
            int i15 = bVar.f74522c;
            if (i15 == -2) {
                i15 = 1;
            }
            jf.d.addOrReplaceSpan(spannable, new jf.e(i14, i13, i15), i10, i11, 33);
        }
        int rubyType = hVar.getRubyType();
        if (rubyType == 2) {
            while (true) {
                eVar2 = null;
                if (eVar == null) {
                    eVar = null;
                    break;
                }
                h hVarResolveStyle2 = resolveStyle(eVar.f74539f, eVar.getStyleIds(), map);
                if (hVarResolveStyle2 != null && hVarResolveStyle2.getRubyType() == 1) {
                    break;
                } else {
                    eVar = eVar.f74543j;
                }
            }
            if (eVar != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(eVar);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    e eVar3 = (e) arrayDeque.pop();
                    h hVarResolveStyle3 = resolveStyle(eVar3.f74539f, eVar3.getStyleIds(), map);
                    if (hVarResolveStyle3 != null && hVarResolveStyle3.getRubyType() == 3) {
                        eVar2 = eVar3;
                        break;
                    }
                    for (int childCount = eVar3.getChildCount() - 1; childCount >= 0; childCount--) {
                        arrayDeque.push(eVar3.getChild(childCount));
                    }
                }
                if (eVar2 != null) {
                    if (eVar2.getChildCount() != 1 || eVar2.getChild(0).f74535b == null) {
                        f0.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = (String) n1.castNonNull(eVar2.getChild(0).f74535b);
                        h hVarResolveStyle4 = resolveStyle(eVar2.f74539f, eVar2.getStyleIds(), map);
                        int rubyPosition = hVarResolveStyle4 != null ? hVarResolveStyle4.getRubyPosition() : -1;
                        if (rubyPosition == -1 && (hVarResolveStyle = resolveStyle(eVar.f74539f, eVar.getStyleIds(), map)) != null) {
                            rubyPosition = hVarResolveStyle.getRubyPosition();
                        }
                        spannable.setSpan(new jf.c(str, rubyPosition), i10, i11, 33);
                    }
                }
            }
        } else if (rubyType == 3 || rubyType == 4) {
            spannable.setSpan(new a(), i10, i11, 33);
        }
        if (hVar.getTextCombine()) {
            jf.d.addOrReplaceSpan(spannable, new jf.a(), i10, i11, 33);
        }
        int fontSizeUnit = hVar.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            jf.d.addOrReplaceSpan(spannable, new AbsoluteSizeSpan((int) hVar.getFontSize(), true), i10, i11, 33);
        } else if (fontSizeUnit == 2) {
            jf.d.addOrReplaceSpan(spannable, new RelativeSizeSpan(hVar.getFontSize()), i10, i11, 33);
        } else {
            if (fontSizeUnit != 3) {
                return;
            }
            jf.d.addOrReplaceSpan(spannable, new RelativeSizeSpan(hVar.getFontSize() / 100.0f), i10, i11, 33);
        }
    }

    public static h resolveStyle(h hVar, String[] strArr, Map<String, h> map) {
        int i10 = 0;
        if (hVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                h hVar2 = new h();
                int length = strArr.length;
                while (i10 < length) {
                    hVar2.chain(map.get(strArr[i10]));
                    i10++;
                }
                return hVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return hVar.chain(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    hVar.chain(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return hVar;
    }
}

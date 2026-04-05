package m2;

import android.view.inputmethod.EditorInfo;
import com.applovin.shadow.okio.Segment;
import g2.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v0 {
    public static final void update(EditorInfo editorInfo, n imeOptions, j0 textFieldValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(editorInfo, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(imeOptions, "imeOptions");
        kotlin.jvm.internal.e0.checkNotNullParameter(textFieldValue, "textFieldValue");
        int iM5610getImeActioneUduSuo = imeOptions.m5610getImeActioneUduSuo();
        l lVar = m.f73932b;
        int i10 = 6;
        if (m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5592getDefaulteUduSuo())) {
            if (!imeOptions.getSingleLine()) {
                i10 = 0;
            }
        } else if (m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5596getNoneeUduSuo())) {
            i10 = 1;
        } else if (m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5594getGoeUduSuo())) {
            i10 = 2;
        } else if (m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5595getNexteUduSuo())) {
            i10 = 5;
        } else if (m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5597getPreviouseUduSuo())) {
            i10 = 7;
        } else if (m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5598getSearcheUduSuo())) {
            i10 = 3;
        } else if (m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5599getSendeUduSuo())) {
            i10 = 4;
        } else if (!m.m5603equalsimpl0(iM5610getImeActioneUduSuo, lVar.m5593getDoneeUduSuo())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        int iM5611getKeyboardTypePjHm6EE = imeOptions.m5611getKeyboardTypePjHm6EE();
        v vVar = w.f73983b;
        if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5633getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5626getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5629getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5632getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5634getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5628getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5631getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5630getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else {
            if (!w.m5638equalsimpl0(iM5611getKeyboardTypePjHm6EE, vVar.m5627getDecimalPjHm6EE())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!imeOptions.getSingleLine()) {
            int i11 = editorInfo.inputType;
            if ((i11 & 1) == 1) {
                editorInfo.inputType = i11 | 131072;
                if (m.m5603equalsimpl0(imeOptions.m5610getImeActioneUduSuo(), lVar.m5592getDefaulteUduSuo())) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int iM5609getCapitalizationIUNYP9k = imeOptions.m5609getCapitalizationIUNYP9k();
            t tVar = u.f73967b;
            if (u.m5622equalsimpl0(iM5609getCapitalizationIUNYP9k, tVar.m5615getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (u.m5622equalsimpl0(iM5609getCapitalizationIUNYP9k, tVar.m5618getWordsIUNYP9k())) {
                editorInfo.inputType |= Segment.SIZE;
            } else if (u.m5622equalsimpl0(iM5609getCapitalizationIUNYP9k, tVar.m5617getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = a2.m3960getStartimpl(textFieldValue.m5591getSelectiond9O1mEE());
        editorInfo.initialSelEnd = a2.m3955getEndimpl(textFieldValue.m5591getSelectiond9O1mEE());
        c4.c.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }
}

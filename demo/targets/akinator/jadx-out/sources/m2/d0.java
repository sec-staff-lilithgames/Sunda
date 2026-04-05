package m2;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import g2.a2;
import j1.o2;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final o f73899a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73900b;

    /* renamed from: c, reason: collision with root package name */
    public int f73901c;

    /* renamed from: d, reason: collision with root package name */
    public j0 f73902d;

    /* renamed from: e, reason: collision with root package name */
    public int f73903e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f73904f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f73905g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f73906h;

    public d0(j0 initState, o eventCallback, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initState, "initState");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventCallback, "eventCallback");
        this.f73899a = eventCallback;
        this.f73900b = z10;
        this.f73902d = initState;
        this.f73905g = new ArrayList();
        this.f73906h = true;
    }

    public final void a(d dVar) {
        this.f73901c++;
        try {
            this.f73905g.add(dVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i10 = this.f73901c - 1;
        this.f73901c = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.f73905g;
            if (!arrayList.isEmpty()) {
                ((o0) this.f73899a).onEditCommands(uu.y0.toMutableList((Collection) arrayList));
                arrayList.clear();
            }
        }
        return this.f73901c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        this.f73901c++;
        return true;
    }

    public final void c(int i10) {
        sendKeyEvent(new KeyEvent(0, i10));
        sendKeyEvent(new KeyEvent(1, i10));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        boolean z10 = this.f73906h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f73905g.clear();
        this.f73901c = 0;
        this.f73906h = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z10 = this.f73906h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inputContentInfo, "inputContentInfo");
        boolean z10 = this.f73906h;
        if (z10) {
            return false;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z10 = this.f73906h;
        return z10 ? this.f73900b : z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        boolean z10 = this.f73906h;
        if (z10) {
            a(new a(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        a(new b(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        a(new c(i10, i11));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        a(new i());
        return true;
    }

    public final boolean getAutoCorrect() {
        return this.f73900b;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i10) {
        return TextUtils.getCapsMode(this.f73902d.getText(), a2.m3958getMinimpl(this.f73902d.m5591getSelectiond9O1mEE()), i10);
    }

    public final o getEventCallback() {
        return this.f73899a;
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f73904f = z10;
        if (z10) {
            this.f73903e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return s.toExtractedText(this.f73902d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    public final j0 getMTextFieldValue$ui_release() {
        return this.f73902d;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i10) {
        if (a2.m3954getCollapsedimpl(this.f73902d.m5591getSelectiond9O1mEE())) {
            return null;
        }
        return k0.getSelectedText(this.f73902d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i10, int i11) {
        return k0.getTextAfterSelection(this.f73902d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i10, int i11) {
        return k0.getTextBeforeSelection(this.f73902d, i10).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        boolean z10 = this.f73906h;
        if (z10) {
            z10 = false;
            switch (i10) {
                case R.id.selectAll:
                    a(new g0(0, this.f73902d.getText().length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        int iM5592getDefaulteUduSuo;
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        if (i10 != 0) {
            switch (i10) {
                case 2:
                    iM5592getDefaulteUduSuo = m.f73932b.m5594getGoeUduSuo();
                    break;
                case 3:
                    iM5592getDefaulteUduSuo = m.f73932b.m5598getSearcheUduSuo();
                    break;
                case 4:
                    iM5592getDefaulteUduSuo = m.f73932b.m5599getSendeUduSuo();
                    break;
                case 5:
                    iM5592getDefaulteUduSuo = m.f73932b.m5595getNexteUduSuo();
                    break;
                case 6:
                    iM5592getDefaulteUduSuo = m.f73932b.m5593getDoneeUduSuo();
                    break;
                case 7:
                    iM5592getDefaulteUduSuo = m.f73932b.m5597getPreviouseUduSuo();
                    break;
                default:
                    o2.u(i10, "IME sends unsupported Editor Action: ", "RecordingIC");
                    iM5592getDefaulteUduSuo = m.f73932b.m5592getDefaulteUduSuo();
                    break;
            }
        } else {
            iM5592getDefaulteUduSuo = m.f73932b.m5592getDefaulteUduSuo();
        }
        ((o0) this.f73899a).mo5612onImeActionKlQnJC8(iM5592getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z10 = this.f73906h;
        if (z10) {
            return true;
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z10) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        Log.w("RecordingIC", "requestCursorUpdates is not supported");
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        ((o0) this.f73899a).onKeyEvent(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        boolean z10 = this.f73906h;
        if (z10) {
            a(new e0(i10, i11));
        }
        return z10;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        boolean z10 = this.f73906h;
        if (z10) {
            a(new f0(String.valueOf(charSequence), i10));
        }
        return z10;
    }

    public final void setMTextFieldValue$ui_release(j0 value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f73902d = value;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        boolean z10 = this.f73906h;
        if (!z10) {
            return z10;
        }
        a(new g0(i10, i11));
        return true;
    }

    public final void updateInputState(j0 state, p inputMethodManager, View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.e0.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        if (this.f73906h) {
            setMTextFieldValue$ui_release(state);
            if (this.f73904f) {
                inputMethodManager.updateExtractedText(view, this.f73903e, s.toExtractedText(state));
            }
            a2 a2VarM5590getCompositionMzsxiRA = state.m5590getCompositionMzsxiRA();
            int iM3958getMinimpl = a2VarM5590getCompositionMzsxiRA != null ? a2.m3958getMinimpl(a2VarM5590getCompositionMzsxiRA.m3964unboximpl()) : -1;
            a2 a2VarM5590getCompositionMzsxiRA2 = state.m5590getCompositionMzsxiRA();
            inputMethodManager.updateSelection(view, a2.m3958getMinimpl(state.m5591getSelectiond9O1mEE()), a2.m3957getMaximpl(state.m5591getSelectiond9O1mEE()), iM3958getMinimpl, a2VarM5590getCompositionMzsxiRA2 != null ? a2.m3957getMaximpl(a2VarM5590getCompositionMzsxiRA2.m3964unboximpl()) : -1);
        }
    }
}

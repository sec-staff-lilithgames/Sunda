package u4;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.b f87830a;

    /* renamed from: b, reason: collision with root package name */
    public int f87831b;

    /* renamed from: c, reason: collision with root package name */
    public int f87832c;

    public a(EditText editText) {
        this(editText, true);
    }

    public int getEmojiReplaceStrategy() {
        return this.f87832c;
    }

    public KeyListener getKeyListener(KeyListener keyListener) {
        this.f87830a.getClass();
        if (keyListener instanceof h) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new h(keyListener);
    }

    public int getMaxEmojiCount() {
        return this.f87831b;
    }

    public boolean isEnabled() {
        return ((n) this.f87830a.f6757b).isEnabled();
    }

    public InputConnection onCreateInputConnection(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        androidx.localbroadcastmanager.content.b bVar = this.f87830a;
        bVar.getClass();
        return inputConnection instanceof d ? inputConnection : new d((EditText) bVar.f6756a, inputConnection, editorInfo);
    }

    public void setEmojiReplaceStrategy(int i10) {
        this.f87832c = i10;
        ((n) this.f87830a.f6757b).f87854g = i10;
    }

    public void setEnabled(boolean z10) {
        ((n) this.f87830a.f6757b).setEnabled(z10);
    }

    public void setMaxEmojiCount(int i10) {
        w3.i.checkArgumentNonnegative(i10, "maxEmojiCount should be greater than 0");
        this.f87831b = i10;
        ((n) this.f87830a.f6757b).f87853f = i10;
    }

    public a(EditText editText, boolean z10) {
        this.f87831b = Integer.MAX_VALUE;
        this.f87832c = 0;
        w3.i.checkNotNull(editText, "editText cannot be null");
        androidx.localbroadcastmanager.content.b bVar = new androidx.localbroadcastmanager.content.b();
        bVar.f6756a = editText;
        n nVar = new n(editText, z10);
        bVar.f6757b = nVar;
        editText.addTextChangedListener(nVar);
        editText.setEditableFactory(b.getInstance());
        this.f87830a = bVar;
    }
}

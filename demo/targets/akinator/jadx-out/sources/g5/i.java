package g5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final Preference f57293b;

    public i(Preference preference) {
        this.f57293b = preference;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.f57293b;
        CharSequence summary = preference.getSummary();
        if (!preference.isCopyingEnabled() || TextUtils.isEmpty(summary)) {
            return;
        }
        contextMenu.setHeaderTitle(summary);
        contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.f57293b;
        ClipboardManager clipboardManager = (ClipboardManager) preference.getContext().getSystemService("clipboard");
        CharSequence summary = preference.getSummary();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", summary));
        Toast.makeText(preference.getContext(), preference.getContext().getString(R.string.preference_copied, summary), 0).show();
        return true;
    }
}

package x3;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f0 {
    @Deprecated
    public static boolean collapseActionView(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean expandActionView(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    public static e getActionProvider(MenuItem menuItem) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).getSupportActionProvider();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View getActionView(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int getAlphabeticModifiers(MenuItem menuItem) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.v(menuItem);
        }
        return 0;
    }

    public static CharSequence getContentDescription(MenuItem menuItem) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.G(menuItem);
        }
        return null;
    }

    public static ColorStateList getIconTintList(MenuItem menuItem) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.M(menuItem);
        }
        return null;
    }

    public static PorterDuff.Mode getIconTintMode(MenuItem menuItem) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.N(menuItem);
        }
        return null;
    }

    public static int getNumericModifiers(MenuItem menuItem) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.Y(menuItem);
        }
        return 0;
    }

    public static CharSequence getTooltipText(MenuItem menuItem) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return androidx.appcompat.app.j0.g0(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean isActionViewExpanded(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    public static MenuItem setActionProvider(MenuItem menuItem, e eVar) {
        if (menuItem instanceof q3.b) {
            return ((q3.b) menuItem).setSupportActionProvider(eVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void setAlphabeticShortcut(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof q3.b) {
            ((q3.b) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.o0(menuItem, c10, i10);
        }
    }

    public static void setContentDescription(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof q3.b) {
            ((q3.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.u0(menuItem, charSequence);
        }
    }

    public static void setIconTintList(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof q3.b) {
            ((q3.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.z0(menuItem, colorStateList);
        }
    }

    public static void setIconTintMode(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof q3.b) {
            ((q3.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.A0(menuItem, mode);
        }
    }

    public static void setNumericShortcut(MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof q3.b) {
            ((q3.b) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.C0(menuItem, c10, i10);
        }
    }

    @Deprecated
    public static MenuItem setOnActionExpandListener(MenuItem menuItem, e0 e0Var) {
        return menuItem.setOnActionExpandListener(new d0());
    }

    public static void setShortcut(MenuItem menuItem, char c10, char c11, int i10, int i11) {
        if (menuItem instanceof q3.b) {
            ((q3.b) menuItem).setShortcut(c10, c11, i10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.E0(menuItem, c10, c11, i10, i11);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }

    public static void setTooltipText(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof q3.b) {
            ((q3.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.app.j0.J0(menuItem, charSequence);
        }
    }

    @Deprecated
    public static MenuItem setActionView(MenuItem menuItem, int i10) {
        return menuItem.setActionView(i10);
    }
}

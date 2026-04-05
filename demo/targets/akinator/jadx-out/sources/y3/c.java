package y3;

import a2.h4;
import android.R;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import cv.BLca.YsiBvdpw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static int f94033d;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f94034a;

    /* renamed from: b, reason: collision with root package name */
    public int f94035b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f94036c = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f94037e = new a(1, (CharSequence) null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f94038f = new a(2, (CharSequence) null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f94039g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f94040h;

        /* renamed from: i, reason: collision with root package name */
        public static final a f94041i;

        /* renamed from: j, reason: collision with root package name */
        public static final a f94042j;

        /* renamed from: k, reason: collision with root package name */
        public static final a f94043k;

        /* renamed from: l, reason: collision with root package name */
        public static final a f94044l;

        /* renamed from: m, reason: collision with root package name */
        public static final a f94045m;

        /* renamed from: n, reason: collision with root package name */
        public static final a f94046n;

        /* renamed from: o, reason: collision with root package name */
        public static final a f94047o;

        /* renamed from: p, reason: collision with root package name */
        public static final a f94048p;

        /* renamed from: q, reason: collision with root package name */
        public static final a f94049q;

        /* renamed from: r, reason: collision with root package name */
        public static final a f94050r;

        /* renamed from: s, reason: collision with root package name */
        public static final a f94051s;

        /* renamed from: t, reason: collision with root package name */
        public static final a f94052t;

        /* renamed from: a, reason: collision with root package name */
        public final Object f94053a;

        /* renamed from: b, reason: collision with root package name */
        public final int f94054b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f94055c;

        /* renamed from: d, reason: collision with root package name */
        public final x f94056d;

        static {
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            f94039g = new a(16, (CharSequence) null);
            new a(32, (CharSequence) null);
            f94040h = new a(64, (CharSequence) null);
            f94041i = new a(128, (CharSequence) null);
            new a(NotificationCompat.FLAG_LOCAL_ONLY, q.class);
            new a(512, q.class);
            new a(1024, r.class);
            new a(2048, r.class);
            f94042j = new a(4096, (CharSequence) null);
            f94043k = new a(Segment.SIZE, (CharSequence) null);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(C.DEFAULT_BUFFER_SEGMENT_SIZE, (CharSequence) null);
            new a(131072, v.class);
            f94044l = new a(262144, (CharSequence) null);
            f94045m = new a(524288, (CharSequence) null);
            f94046n = new a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, (CharSequence) null);
            new a(2097152, w.class);
            int i10 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f94047o = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, t.class);
            f94048p = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f94049q = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f94050r = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f94051s = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, u.class);
            new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, s.class);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f94052t = new a(i10 >= 34 ? g.getActionScrollInDirection() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a createReplacementAction(CharSequence charSequence, x xVar) {
            return new a(null, this.f94054b, charSequence, xVar, this.f94055c);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f94053a;
            Object obj3 = this.f94053a;
            return obj3 == null ? obj2 == null : obj3.equals(obj2);
        }

        public int getId() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f94053a).getId();
        }

        public CharSequence getLabel() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f94053a).getLabel();
        }

        public int hashCode() {
            Object obj = this.f94053a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean perform(View view, Bundle bundle) {
            p pVar;
            x xVar = this.f94056d;
            if (xVar == null) {
                return false;
            }
            Class cls = this.f94055c;
            p pVar2 = null;
            if (cls != null) {
                try {
                    pVar = (p) cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    pVar.setBundle(bundle);
                    pVar2 = pVar;
                } catch (Exception e11) {
                    e = e11;
                    pVar2 = pVar;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls == null ? AbstractJsonLexerKt.NULL : cls.getName()), e);
                    return xVar.perform(view, pVar2);
                }
            }
            return xVar.perform(view, pVar2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
            String strB = c.b(this.f94054b);
            if (strB.equals("ACTION_UNKNOWN") && getLabel() != null) {
                strB = getLabel().toString();
            }
            sb2.append(strB);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, x xVar) {
            this(null, i10, charSequence, xVar, null);
        }

        public a(int i10, Class cls) {
            this(null, i10, null, null, cls);
        }

        public a(Object obj, int i10, CharSequence charSequence, x xVar, Class cls) {
            this.f94054b = i10;
            this.f94056d = xVar;
            if (obj == null) {
                this.f94053a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f94053a = obj;
            }
            this.f94055c = cls;
        }
    }

    @Deprecated
    public c(Object obj) {
        this.f94034a = (AccessibilityNodeInfo) obj;
    }

    public static String b(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case Segment.SIZE /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static c e(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (accessibilityNodeInfo != null) {
            return new c((Object) accessibilityNodeInfo);
        }
        return null;
    }

    public static ClickableSpan[] getClickableSpans(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static c obtain(View view) {
        return wrap(AccessibilityNodeInfo.obtain(view));
    }

    public static c wrap(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public final ArrayList a(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void addAction(int i10) {
        this.f94034a.addAction(i10);
    }

    public void addChild(View view) {
        this.f94034a.addChild(view);
    }

    public void addLabeledBy(View view) {
        addLabeledBy(view, -1);
    }

    public void addSpansToExtras(CharSequence charSequence, View view) {
        int iKeyAt;
        if (Build.VERSION.SDK_INT < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(com.digidust.elokence.akinator.freemium.R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    if (((WeakReference) sparseArray.valueAt(i10)).get() == null) {
                        arrayList.add(Integer.valueOf(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    sparseArray.remove(((Integer) arrayList.get(i11)).intValue());
                }
            }
            ClickableSpan[] clickableSpans = getClickableSpans(charSequence);
            if (clickableSpans == null || clickableSpans.length <= 0) {
                return;
            }
            getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", com.digidust.elokence.akinator.freemium.R.id.accessibility_action_clickable_span);
            SparseArray sparseArray2 = (SparseArray) view.getTag(com.digidust.elokence.akinator.freemium.R.id.tag_accessibility_clickable_spans);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                view.setTag(com.digidust.elokence.akinator.freemium.R.id.tag_accessibility_clickable_spans, sparseArray2);
            }
            for (int i12 = 0; i12 < clickableSpans.length; i12++) {
                ClickableSpan clickableSpan = clickableSpans[i12];
                int i13 = 0;
                while (true) {
                    if (i13 >= sparseArray2.size()) {
                        iKeyAt = f94033d;
                        f94033d = iKeyAt + 1;
                        break;
                    } else {
                        if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i13)).get())) {
                            iKeyAt = sparseArray2.keyAt(i13);
                            break;
                        }
                        i13++;
                    }
                }
                sparseArray2.put(iKeyAt, new WeakReference(clickableSpans[i12]));
                ClickableSpan clickableSpan2 = clickableSpans[i12];
                Spanned spanned = (Spanned) charSequence;
                a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
            }
        }
    }

    public final boolean c(int i10) {
        Bundle extras = getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    public boolean canOpenPopup() {
        return this.f94034a.canOpenPopup();
    }

    public final void d(int i10, boolean z10) {
        Bundle extras = getExtras();
        if (extras != null) {
            int i11 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = cVar.f94034a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f94034a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f94036c == cVar.f94036c && this.f94035b == cVar.f94035b;
    }

    public List<c> findAccessibilityNodeInfosByText(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f94034a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(wrap(listFindAccessibilityNodeInfosByText.get(i10)));
        }
        return arrayList;
    }

    public List<c> findAccessibilityNodeInfosByViewId(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f94034a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(wrap(it.next()));
        }
        return arrayList;
    }

    public c findFocus(int i10) {
        return e(this.f94034a.findFocus(i10));
    }

    public c focusSearch(int i10) {
        return e(this.f94034a.focusSearch(i10));
    }

    public List<a> getActionList() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f94034a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10), 0, null, null, null));
        }
        return arrayList;
    }

    @Deprecated
    public int getActions() {
        return this.f94034a.getActions();
    }

    public List<String> getAvailableExtraData() {
        return Build.VERSION.SDK_INT >= 26 ? this.f94034a.getAvailableExtraData() : Collections.EMPTY_LIST;
    }

    @Deprecated
    public void getBoundsInParent(Rect rect) {
        this.f94034a.getBoundsInParent(rect);
    }

    public void getBoundsInScreen(Rect rect) {
        this.f94034a.getBoundsInScreen(rect);
    }

    public void getBoundsInWindow(Rect rect) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 34) {
            g.getBoundsInWindow(accessibilityNodeInfo, rect);
            return;
        }
        Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public int getChecked() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 36 ? i.a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
    }

    public c getChild(int i10) {
        return e(this.f94034a.getChild(i10));
    }

    public int getChildCount() {
        return this.f94034a.getChildCount();
    }

    public CharSequence getClassName() {
        return this.f94034a.getClassName();
    }

    public j getCollectionInfo() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f94034a.getCollectionInfo();
        if (collectionInfo != null) {
            return new j(collectionInfo);
        }
        return null;
    }

    public k getCollectionItemInfo() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f94034a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new k(collectionItemInfo);
        }
        return null;
    }

    public CharSequence getContainerTitle() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 34 ? g.getContainerTitle(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public CharSequence getContentDescription() {
        return this.f94034a.getContentDescription();
    }

    public int getDrawingOrder() {
        return this.f94034a.getDrawingOrder();
    }

    public CharSequence getError() {
        return this.f94034a.getError();
    }

    public int getExpandedState() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 36 ? i.getExpandedState(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.getExtraRenderingInfo(this.f94034a);
        }
        return null;
    }

    public Bundle getExtras() {
        return this.f94034a.getExtras();
    }

    public CharSequence getHintText() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 26 ? accessibilityNodeInfo.getHintText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    @Deprecated
    public Object getInfo() {
        return this.f94034a;
    }

    public int getInputType() {
        return this.f94034a.getInputType();
    }

    public c getLabelFor() {
        return e(this.f94034a.getLabelFor());
    }

    @Deprecated
    public c getLabeledBy() {
        return e(this.f94034a.getLabeledBy());
    }

    public List<c> getLabeledByList() {
        if (Build.VERSION.SDK_INT >= 36) {
            return i.d(this.f94034a);
        }
        ArrayList arrayList = new ArrayList(1);
        c labeledBy = getLabeledBy();
        if (labeledBy != null) {
            arrayList.add(labeledBy);
        }
        return arrayList;
    }

    public int getLiveRegion() {
        return this.f94034a.getLiveRegion();
    }

    public int getMaxTextLength() {
        return this.f94034a.getMaxTextLength();
    }

    public int getMovementGranularities() {
        return this.f94034a.getMovementGranularities();
    }

    public CharSequence getPackageName() {
        return this.f94034a.getPackageName();
    }

    public CharSequence getPaneTitle() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 28 ? accessibilityNodeInfo.getPaneTitle() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
    }

    public c getParent() {
        return e(this.f94034a.getParent());
    }

    public b getRangeInfo() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f94034a.getRangeInfo();
        if (rangeInfo != null) {
            return new b(rangeInfo);
        }
        return null;
    }

    public CharSequence getRoleDescription() {
        return this.f94034a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    public CharSequence getStateDescription() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 30 ? d.getStateDescription(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public CharSequence getSupplementalDescription() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 36 ? i.getSupplementalDescription(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public CharSequence getText() {
        boolean zIsEmpty = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListA = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListA2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListA3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListA4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i10 = 0; i10 < arrayListA.size(); i10++) {
            spannableString.setSpan(new y3.a(((Integer) arrayListA4.get(i10)).intValue(), this, getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListA.get(i10)).intValue(), ((Integer) arrayListA2.get(i10)).intValue(), ((Integer) arrayListA3.get(i10)).intValue());
        }
        return spannableString;
    }

    public int getTextSelectionEnd() {
        return this.f94034a.getTextSelectionEnd();
    }

    public int getTextSelectionStart() {
        return this.f94034a.getTextSelectionStart();
    }

    public CharSequence getTooltipText() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public C0810c getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f94034a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new C0810c(touchDelegateInfo);
    }

    public c getTraversalAfter() {
        return e(this.f94034a.getTraversalAfter());
    }

    public c getTraversalBefore() {
        return e(this.f94034a.getTraversalBefore());
    }

    public String getUniqueId() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 33 ? e.getUniqueId(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public String getViewIdResourceName() {
        return this.f94034a.getViewIdResourceName();
    }

    public a0 getWindow() {
        AccessibilityWindowInfo window = this.f94034a.getWindow();
        if (window != null) {
            return new a0(window);
        }
        return null;
    }

    public int getWindowId() {
        return this.f94034a.getWindowId();
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        return Build.VERSION.SDK_INT >= 34 ? g.hasRequestInitialAccessibilityFocus(this.f94034a) : c(32);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean isAccessibilityDataSensitive() {
        return Build.VERSION.SDK_INT >= 34 ? g.isAccessibilityDataSensitive(this.f94034a) : c(64);
    }

    public boolean isAccessibilityFocused() {
        return this.f94034a.isAccessibilityFocused();
    }

    public boolean isCheckable() {
        return this.f94034a.isCheckable();
    }

    @Deprecated
    public boolean isChecked() {
        return this.f94034a.isChecked();
    }

    public boolean isClickable() {
        return this.f94034a.isClickable();
    }

    public boolean isContentInvalid() {
        return this.f94034a.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.f94034a.isContextClickable();
    }

    public boolean isDismissable() {
        return this.f94034a.isDismissable();
    }

    public boolean isEditable() {
        return this.f94034a.isEditable();
    }

    public boolean isEnabled() {
        return this.f94034a.isEnabled();
    }

    public boolean isFieldRequired() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 36 ? i.isFieldRequired(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public boolean isFocusable() {
        return this.f94034a.isFocusable();
    }

    public boolean isFocused() {
        return this.f94034a.isFocused();
    }

    public boolean isGranularScrollingSupported() {
        return c(67108864);
    }

    public boolean isHeading() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f94034a.isHeading();
        }
        if (c(2)) {
            return true;
        }
        k collectionItemInfo = getCollectionItemInfo();
        return collectionItemInfo != null && collectionItemInfo.isHeading();
    }

    public boolean isImportantForAccessibility() {
        return this.f94034a.isImportantForAccessibility();
    }

    public boolean isLongClickable() {
        return this.f94034a.isLongClickable();
    }

    public boolean isMultiLine() {
        return this.f94034a.isMultiLine();
    }

    public boolean isPassword() {
        return this.f94034a.isPassword();
    }

    public boolean isScreenReaderFocusable() {
        return Build.VERSION.SDK_INT >= 28 ? this.f94034a.isScreenReaderFocusable() : c(1);
    }

    public boolean isScrollable() {
        return this.f94034a.isScrollable();
    }

    public boolean isSelected() {
        return this.f94034a.isSelected();
    }

    public boolean isShowingHintText() {
        return Build.VERSION.SDK_INT >= 26 ? this.f94034a.isShowingHintText() : c(4);
    }

    public boolean isTextEntryKey() {
        return Build.VERSION.SDK_INT >= 29 ? this.f94034a.isTextEntryKey() : c(8);
    }

    public boolean isTextSelectable() {
        return Build.VERSION.SDK_INT >= 33 ? e.isTextSelectable(this.f94034a) : c(8388608);
    }

    public boolean isVisibleToUser() {
        return this.f94034a.isVisibleToUser();
    }

    public boolean performAction(int i10) {
        return this.f94034a.performAction(i10);
    }

    @Deprecated
    public void recycle() {
    }

    public boolean refresh() {
        return this.f94034a.refresh();
    }

    public boolean removeAction(a aVar) {
        return this.f94034a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f94053a);
    }

    public boolean removeChild(View view) {
        return this.f94034a.removeChild(view);
    }

    public boolean removeLabeledBy(View view) {
        return removeLabeledBy(view, -1);
    }

    public void setAccessibilityDataSensitive(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.setAccessibilityDataSensitive(this.f94034a, z10);
        } else {
            d(64, z10);
        }
    }

    public void setAccessibilityFocused(boolean z10) {
        this.f94034a.setAccessibilityFocused(z10);
    }

    public void setAvailableExtraData(List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f94034a.setAvailableExtraData(list);
        }
    }

    @Deprecated
    public void setBoundsInParent(Rect rect) {
        this.f94034a.setBoundsInParent(rect);
    }

    public void setBoundsInScreen(Rect rect) {
        this.f94034a.setBoundsInScreen(rect);
    }

    public void setBoundsInWindow(Rect rect) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 34) {
            g.setBoundsInWindow(accessibilityNodeInfo, rect);
        } else {
            accessibilityNodeInfo.getExtras().putParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect);
        }
    }

    public void setCanOpenPopup(boolean z10) {
        this.f94034a.setCanOpenPopup(z10);
    }

    public void setCheckable(boolean z10) {
        this.f94034a.setCheckable(z10);
    }

    @Deprecated
    public void setChecked(boolean z10) {
        this.f94034a.setChecked(z10);
    }

    public void setClassName(CharSequence charSequence) {
        this.f94034a.setClassName(charSequence);
    }

    public void setClickable(boolean z10) {
        this.f94034a.setClickable(z10);
    }

    public void setCollectionInfo(Object obj) {
        this.f94034a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((j) obj).f94060a);
    }

    public void setCollectionItemInfo(Object obj) {
        this.f94034a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((k) obj).f94061a);
    }

    public void setContainerTitle(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 34) {
            g.setContainerTitle(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.f94034a.setContentDescription(charSequence);
    }

    public void setContentInvalid(boolean z10) {
        this.f94034a.setContentInvalid(z10);
    }

    public void setContextClickable(boolean z10) {
        this.f94034a.setContextClickable(z10);
    }

    public void setDismissable(boolean z10) {
        this.f94034a.setDismissable(z10);
    }

    public void setDrawingOrder(int i10) {
        this.f94034a.setDrawingOrder(i10);
    }

    public void setEditable(boolean z10) {
        this.f94034a.setEditable(z10);
    }

    public void setEnabled(boolean z10) {
        this.f94034a.setEnabled(z10);
    }

    public void setError(CharSequence charSequence) {
        this.f94034a.setError(charSequence);
    }

    public void setExpandedState(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i11 >= 36) {
            i.setExpandedState(accessibilityNodeInfo, i10);
        } else {
            accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", i10);
        }
    }

    public void setFieldRequired(boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 36) {
            i.setFieldRequired(accessibilityNodeInfo, z10);
        } else {
            accessibilityNodeInfo.getExtras().putBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY", z10);
        }
    }

    public void setFocusable(boolean z10) {
        this.f94034a.setFocusable(z10);
    }

    public void setFocused(boolean z10) {
        this.f94034a.setFocused(z10);
    }

    public void setGranularScrollingSupported(boolean z10) {
        d(67108864, z10);
    }

    public void setHeading(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f94034a.setHeading(z10);
        } else {
            d(2, z10);
        }
    }

    public void setHintText(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 26) {
            accessibilityNodeInfo.setHintText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void setImportantForAccessibility(boolean z10) {
        this.f94034a.setImportantForAccessibility(z10);
    }

    public void setInputType(int i10) {
        this.f94034a.setInputType(i10);
    }

    public void setLabelFor(View view) {
        this.f94034a.setLabelFor(view);
    }

    @Deprecated
    public void setLabeledBy(View view) {
        this.f94034a.setLabeledBy(view);
    }

    public void setLiveRegion(int i10) {
        this.f94034a.setLiveRegion(i10);
    }

    public void setLongClickable(boolean z10) {
        this.f94034a.setLongClickable(z10);
    }

    public void setMaxTextLength(int i10) {
        this.f94034a.setMaxTextLength(i10);
    }

    public void setMinDurationBetweenContentChangesMillis(long j10) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 34) {
            g.setMinDurationBetweenContentChangeMillis(accessibilityNodeInfo, j10);
        } else {
            accessibilityNodeInfo.getExtras().putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", j10);
        }
    }

    public void setMovementGranularities(int i10) {
        this.f94034a.setMovementGranularities(i10);
    }

    public void setMultiLine(boolean z10) {
        this.f94034a.setMultiLine(z10);
    }

    public void setPackageName(CharSequence charSequence) {
        this.f94034a.setPackageName(charSequence);
    }

    public void setPaneTitle(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void setParent(View view) {
        this.f94035b = -1;
        this.f94034a.setParent(view);
    }

    public void setPassword(boolean z10) {
        this.f94034a.setPassword(z10);
    }

    public void setQueryFromAppProcessEnabled(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.setQueryFromAppProcessEnabled(this.f94034a, view, z10);
        }
    }

    public void setRangeInfo(b bVar) {
        this.f94034a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) bVar.f94057a);
    }

    public void setRequestInitialAccessibilityFocus(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            g.setRequestInitialAccessibilityFocus(this.f94034a, z10);
        } else {
            d(32, z10);
        }
    }

    public void setRoleDescription(CharSequence charSequence) {
        this.f94034a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void setScreenReaderFocusable(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f94034a.setScreenReaderFocusable(z10);
        } else {
            d(1, z10);
        }
    }

    public void setScrollable(boolean z10) {
        this.f94034a.setScrollable(z10);
    }

    public void setSelected(boolean z10) {
        this.f94034a.setSelected(z10);
    }

    public void setShowingHintText(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f94034a.setShowingHintText(z10);
        } else {
            d(4, z10);
        }
    }

    public void setSource(View view) {
        this.f94036c = -1;
        this.f94034a.setSource(view);
    }

    public void setStateDescription(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 30) {
            d.setStateDescription(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void setSupplementalDescription(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 36) {
            i.setSupplementalDescription(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY", charSequence);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f94034a.setText(charSequence);
    }

    public void setTextEntryKey(boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f94034a.setTextEntryKey(z10);
        } else {
            d(8, z10);
        }
    }

    public void setTextSelectable(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            e.setTextSelectable(this.f94034a, z10);
        } else {
            d(8388608, z10);
        }
    }

    public void setTextSelection(int i10, int i11) {
        this.f94034a.setTextSelection(i10, i11);
    }

    public void setTooltipText(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 28) {
            accessibilityNodeInfo.setTooltipText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void setTouchDelegateInfo(C0810c c0810c) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f94034a.setTouchDelegateInfo(c0810c.f94058a);
        }
    }

    public void setTraversalAfter(View view) {
        this.f94034a.setTraversalAfter(view);
    }

    public void setTraversalBefore(View view) {
        this.f94034a.setTraversalBefore(view);
    }

    public void setUniqueId(String str) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i10 >= 33) {
            e.setUniqueId(accessibilityNodeInfo, str);
        } else {
            accessibilityNodeInfo.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", str);
        }
    }

    public void setViewIdResourceName(String str) {
        this.f94034a.setViewIdResourceName(str);
    }

    public void setVisibleToUser(boolean z10) {
        this.f94034a.setVisibleToUser(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        sb2.append("; boundsInParent: " + rect);
        getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        getBoundsInWindow(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(getPackageName());
        sb2.append("; className: ");
        sb2.append(getClassName());
        sb2.append("; text: ");
        sb2.append(getText());
        sb2.append("; error: ");
        sb2.append(getError());
        sb2.append("; maxTextLength: ");
        sb2.append(getMaxTextLength());
        sb2.append("; stateDescription: ");
        sb2.append(getStateDescription());
        sb2.append("; contentDescription: ");
        sb2.append(getContentDescription());
        sb2.append("; supplementalDescription: ");
        sb2.append(getSupplementalDescription());
        sb2.append("; tooltipText: ");
        sb2.append(getTooltipText());
        sb2.append("; viewIdResName: ");
        sb2.append(getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(getUniqueId());
        sb2.append("; checkable: ");
        sb2.append(isCheckable());
        sb2.append("; checked: ");
        int checked = getChecked();
        String str = "PARTIAL";
        sb2.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sb2.append("; fieldRequired: ");
        sb2.append(isFieldRequired());
        sb2.append("; focusable: ");
        sb2.append(isFocusable());
        sb2.append("; focused: ");
        sb2.append(isFocused());
        sb2.append("; selected: ");
        sb2.append(isSelected());
        sb2.append("; clickable: ");
        sb2.append(isClickable());
        sb2.append("; longClickable: ");
        sb2.append(isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(isContextClickable());
        sb2.append("; expandedState: ");
        int expandedState = getExpandedState();
        if (expandedState == 0) {
            str = "UNDEFINED";
        } else if (expandedState == 1) {
            str = "COLLAPSED";
        } else if (expandedState != 2) {
            str = expandedState != 3 ? "UNKNOWN" : "FULL";
        }
        sb2.append(str);
        sb2.append("; enabled: ");
        sb2.append(isEnabled());
        sb2.append("; password: ");
        sb2.append(isPassword());
        sb2.append("; scrollable: " + isScrollable());
        sb2.append("; containerTitle: ");
        sb2.append(getContainerTitle());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(isGranularScrollingSupported());
        sb2.append("; importantForAccessibility: ");
        sb2.append(isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        sb2.append(isTextSelectable());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(isAccessibilityDataSensitive());
        sb2.append("; [");
        List<a> actionList = getActionList();
        for (int i10 = 0; i10 < actionList.size(); i10++) {
            a aVar = actionList.get(i10);
            String strB = b(aVar.getId());
            if (strB.equals("ACTION_UNKNOWN") && aVar.getLabel() != null) {
                strB = aVar.getLabel().toString();
            }
            sb2.append(strB);
            if (i10 != actionList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    public AccessibilityNodeInfo unwrap() {
        return this.f94034a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f94057a;

        public b(AccessibilityNodeInfo.RangeInfo rangeInfo) {
            this.f94057a = rangeInfo;
        }

        public static b obtain(int i10, float f10, float f11, float f12) {
            return new b(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float getCurrent() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f94057a).getCurrent();
        }

        public float getMax() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f94057a).getMax();
        }

        public float getMin() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f94057a).getMin();
        }

        public int getType() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f94057a).getType();
        }

        public b(int i10, float f10, float f11, float f12) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f94057a = d.createRangeInfo(i10, f10, f11, f12);
            } else {
                this.f94057a = AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12);
            }
        }
    }

    public static c obtain(View view, int i10) {
        return e(AccessibilityNodeInfo.obtain(view, i10));
    }

    public void addAction(a aVar) {
        this.f94034a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f94053a);
    }

    public void addChild(View view, int i10) {
        this.f94034a.addChild(view, i10);
    }

    public void addLabeledBy(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 36) {
            i.c(this.f94034a, view, i10);
        } else {
            setLabeledBy(view, i10);
        }
    }

    public c getChild(int i10, int i11) {
        return Build.VERSION.SDK_INT >= 33 ? e.getChild(this.f94034a, i10, i11) : getChild(i10);
    }

    public long getMinDurationBetweenContentChangesMillis() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        return i10 >= 34 ? g.getMinDurationBetweenContentChangeMillis(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getLong(YsiBvdpw.GZgCDWBiUxDRo);
    }

    public c getParent(int i10) {
        return Build.VERSION.SDK_INT >= 33 ? e.getParent(this.f94034a, i10) : getParent();
    }

    public boolean performAction(int i10, Bundle bundle) {
        return this.f94034a.performAction(i10, bundle);
    }

    public boolean removeChild(View view, int i10) {
        return this.f94034a.removeChild(view, i10);
    }

    public boolean removeLabeledBy(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 36) {
            return i.e(this.f94034a, view, i10);
        }
        return false;
    }

    public void setChecked(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f94034a;
        if (i11 >= 36) {
            i.b(accessibilityNodeInfo, i10);
            return;
        }
        if (i10 != 1 && i10 != 2 && i10 != 0) {
            throw new IllegalArgumentException(a.b.e(i10, "Unknown checked argument: "));
        }
        accessibilityNodeInfo.setChecked(i10 == 1);
        accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", i10);
    }

    public void setLabelFor(View view, int i10) {
        this.f94034a.setLabelFor(view, i10);
    }

    @Deprecated
    public void setLabeledBy(View view, int i10) {
        this.f94034a.setLabeledBy(view, i10);
    }

    public void setTraversalAfter(View view, int i10) {
        this.f94034a.setTraversalAfter(view, i10);
    }

    public void setTraversalBefore(View view, int i10) {
        this.f94034a.setTraversalBefore(view, i10);
    }

    public void setParent(View view, int i10) {
        this.f94035b = i10;
        this.f94034a.setParent(view, i10);
    }

    public void setSource(View view, int i10) {
        this.f94036c = i10;
        this.f94034a.setSource(view, i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: y3.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0810c {

        /* renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeInfo.TouchDelegateInfo f94058a;

        public C0810c(Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f94058a = h4.f(map);
            } else {
                this.f94058a = null;
            }
        }

        public Region getRegionAt(int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f94058a.getRegionAt(i10);
            }
            return null;
        }

        public int getRegionCount() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f94058a.getRegionCount();
            }
            return 0;
        }

        public c getTargetForRegion(Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f94058a.getTargetForRegion(region)) == null) {
                return null;
            }
            return c.wrap(targetForRegion);
        }

        public C0810c(AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f94058a = touchDelegateInfo;
        }
    }

    public static c obtain() {
        return wrap(AccessibilityNodeInfo.obtain());
    }

    public c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f94034a = accessibilityNodeInfo;
    }

    public static c obtain(c cVar) {
        return wrap(AccessibilityNodeInfo.obtain(cVar.f94034a));
    }
}

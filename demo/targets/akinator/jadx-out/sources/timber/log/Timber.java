package timber.log;

import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import b0.e2;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.n0;
import tu.f;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class Timber {
    public static final Forest Forest = new Forest(null);
    private static final ArrayList<Tree> trees = new ArrayList<>();
    private static volatile Tree[] treeArray = new Tree[0];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class DebugTree extends Tree {
        private static final int MAX_LOG_LENGTH = 4000;
        private static final int MAX_TAG_LENGTH = 23;
        private final List<String> fqcnIgnore = p0.listOf((Object[]) new String[]{Timber.class.getName(), Forest.class.getName(), Tree.class.getName(), DebugTree.class.getName()});
        public static final Companion Companion = new Companion(null);
        private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            private Companion() {
            }
        }

        public String createStackElementTag(StackTraceElement element) {
            e0.checkNotNullParameter(element, "element");
            String className = element.getClassName();
            e0.checkNotNullExpressionValue(className, "element.className");
            String strSubstringAfterLast$default = n0.substringAfterLast$default(className, '.', (String) null, 2, (Object) null);
            Matcher matcher = ANONYMOUS_CLASS.matcher(strSubstringAfterLast$default);
            if (matcher.find()) {
                strSubstringAfterLast$default = matcher.replaceAll("");
                e0.checkNotNullExpressionValue(strSubstringAfterLast$default, "m.replaceAll(\"\")");
            }
            if (strSubstringAfterLast$default.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return strSubstringAfterLast$default;
            }
            String strSubstring = strSubstringAfterLast$default.substring(0, 23);
            e0.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @Override // timber.log.Timber.Tree
        public String getTag$timber_release() {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release != null) {
                return tag$timber_release;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            e0.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                    return createStackElementTag(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        @Override // timber.log.Timber.Tree
        public void log(int i10, String str, String message, Throwable th2) {
            int iMin;
            e0.checkNotNullParameter(message, "message");
            if (message.length() < 4000) {
                if (i10 == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i10, str, message);
                    return;
                }
            }
            int length = message.length();
            int i11 = 0;
            while (i11 < length) {
                String str2 = message;
                int iIndexOf$default = n0.indexOf$default((CharSequence) str2, '\n', i11, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = length;
                }
                while (true) {
                    iMin = Math.min(iIndexOf$default, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    e0.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i10 == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i10, str, strSubstring);
                    }
                    if (iMin >= iIndexOf$default) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
                message = str2;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Forest extends Tree {
        public /* synthetic */ Forest(u uVar) {
            this();
        }

        @Override // timber.log.Timber.Tree
        public void d(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.d(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void e(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.e(str, Arrays.copyOf(args, args.length));
            }
        }

        public final List<Tree> forest() {
            List<Tree> listUnmodifiableList;
            synchronized (Timber.trees) {
                listUnmodifiableList = Collections.unmodifiableList(y0.toList(Timber.trees));
                e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(trees.toList())");
            }
            return listUnmodifiableList;
        }

        @Override // timber.log.Timber.Tree
        public void i(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.i(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void log(int i10, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.log(i10, str, Arrays.copyOf(args, args.length));
            }
        }

        public final void plant(Tree tree) {
            e0.checkNotNullParameter(tree, "tree");
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (Timber.trees) {
                Timber.trees.add(tree);
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.treeArray = (Tree[]) array;
            }
        }

        public final Tree tag(String tag) {
            e0.checkNotNullParameter(tag, "tag");
            Tree[] treeArr = Timber.treeArray;
            int length = treeArr.length;
            int i10 = 0;
            while (i10 < length) {
                Tree tree = treeArr[i10];
                i10++;
                tree.getExplicitTag$timber_release().set(tag);
            }
            return this;
        }

        public final int treeCount() {
            return Timber.treeArray.length;
        }

        public final void uproot(Tree tree) {
            e0.checkNotNullParameter(tree, "tree");
            synchronized (Timber.trees) {
                if (!Timber.trees.remove(tree)) {
                    throw new IllegalArgumentException(e0.stringPlus("Cannot uproot tree which is not planted: ", tree).toString());
                }
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.treeArray = (Tree[]) array;
            }
        }

        public final void uprootAll() {
            synchronized (Timber.trees) {
                Timber.trees.clear();
                Timber.treeArray = new Tree[0];
            }
        }

        @Override // timber.log.Timber.Tree
        public void v(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.v(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void w(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.w(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void wtf(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.wtf(str, Arrays.copyOf(args, args.length));
            }
        }

        private Forest() {
        }

        @Override // timber.log.Timber.Tree
        public void d(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.d(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void e(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.e(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void i(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.i(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void log(int i10, Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.log(i10, th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void v(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.v(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void w(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.w(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void wtf(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.wtf(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public void d(Throwable th2) {
            for (Tree tree : Timber.treeArray) {
                tree.d(th2);
            }
        }

        @Override // timber.log.Timber.Tree
        public void e(Throwable th2) {
            for (Tree tree : Timber.treeArray) {
                tree.e(th2);
            }
        }

        @Override // timber.log.Timber.Tree
        public void i(Throwable th2) {
            for (Tree tree : Timber.treeArray) {
                tree.i(th2);
            }
        }

        @Override // timber.log.Timber.Tree
        public void log(int i10, Throwable th2) {
            for (Tree tree : Timber.treeArray) {
                tree.log(i10, th2);
            }
        }

        @Override // timber.log.Timber.Tree
        public void v(Throwable th2) {
            for (Tree tree : Timber.treeArray) {
                tree.v(th2);
            }
        }

        @Override // timber.log.Timber.Tree
        public void w(Throwable th2) {
            for (Tree tree : Timber.treeArray) {
                tree.w(th2);
            }
        }

        @Override // timber.log.Timber.Tree
        public void wtf(Throwable th2) {
            for (Tree tree : Timber.treeArray) {
                tree.wtf(th2);
            }
        }

        @Override // timber.log.Timber.Tree
        public void log(int i10, String str, String message, Throwable th2) {
            e0.checkNotNullParameter(message, "message");
            throw new AssertionError();
        }

        public final void plant(Tree... trees) {
            e0.checkNotNullParameter(trees, "trees");
            int length = trees.length;
            int i10 = 0;
            while (i10 < length) {
                Tree tree = trees[i10];
                i10++;
                if (tree == null) {
                    throw new IllegalArgumentException("trees contained null");
                }
                if (!(tree != this)) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.");
                }
            }
            synchronized (Timber.trees) {
                Collections.addAll(Timber.trees, Arrays.copyOf(trees, trees.length));
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array != null) {
                    Timber.treeArray = (Tree[]) array;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }

        public Tree asTree() {
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Tree {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String getStackTraceString(Throwable th2) {
            StringWriter stringWriter = new StringWriter(NotificationCompat.FLAG_LOCAL_ONLY);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            e0.checkNotNullExpressionValue(string, "sw.toString()");
            return string;
        }

        private final void prepareLog(int i10, Throwable th2, String str, Object... objArr) {
            String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, i10)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = formatMessage(str, objArr);
                    }
                    if (th2 != null) {
                        str = ((Object) str) + '\n' + getStackTraceString(th2);
                    }
                } else if (th2 == null) {
                    return;
                } else {
                    str = getStackTraceString(th2);
                }
                log(i10, tag$timber_release, str, th2);
            }
        }

        public void d(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void e(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(6, null, str, Arrays.copyOf(args, args.length));
        }

        public String formatMessage(String message, Object[] args) {
            e0.checkNotNullParameter(message, "message");
            e0.checkNotNullParameter(args, "args");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            return e2.m(message, "java.lang.String.format(this, *args)", objArrCopyOf.length, objArrCopyOf);
        }

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void i(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(4, null, str, Arrays.copyOf(args, args.length));
        }

        @f
        public boolean isLoggable(int i10) {
            return true;
        }

        public abstract void log(int i10, String str, String str2, Throwable th2);

        public void log(int i10, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(i10, null, str, Arrays.copyOf(args, args.length));
        }

        public void v(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void w(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(7, null, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(3, th2, str, Arrays.copyOf(args, args.length));
        }

        public void e(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(6, th2, str, Arrays.copyOf(args, args.length));
        }

        public void i(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(4, th2, str, Arrays.copyOf(args, args.length));
        }

        public boolean isLoggable(String str, int i10) {
            return isLoggable(i10);
        }

        public void log(int i10, Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(i10, th2, str, Arrays.copyOf(args, args.length));
        }

        public void v(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(2, th2, str, Arrays.copyOf(args, args.length));
        }

        public void w(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(5, th2, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(Throwable th2, String str, Object... args) {
            e0.checkNotNullParameter(args, "args");
            prepareLog(7, th2, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th2) {
            prepareLog(3, th2, null, new Object[0]);
        }

        public void e(Throwable th2) {
            prepareLog(6, th2, null, new Object[0]);
        }

        public void i(Throwable th2) {
            prepareLog(4, th2, null, new Object[0]);
        }

        public void log(int i10, Throwable th2) {
            prepareLog(i10, th2, null, new Object[0]);
        }

        public void v(Throwable th2) {
            prepareLog(2, th2, null, new Object[0]);
        }

        public void w(Throwable th2) {
            prepareLog(5, th2, null, new Object[0]);
        }

        public void wtf(Throwable th2) {
            prepareLog(7, th2, null, new Object[0]);
        }
    }

    private Timber() {
        throw new AssertionError();
    }

    public static Tree asTree() {
        return Forest.asTree();
    }

    public static void d(String str, Object... objArr) {
        Forest.d(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        Forest.e(str, objArr);
    }

    public static final List<Tree> forest() {
        return Forest.forest();
    }

    public static void i(String str, Object... objArr) {
        Forest.i(str, objArr);
    }

    public static void log(int i10, String str, Object... objArr) {
        Forest.log(i10, str, objArr);
    }

    public static final void plant(Tree tree) {
        Forest.plant(tree);
    }

    public static final Tree tag(String str) {
        return Forest.tag(str);
    }

    public static final int treeCount() {
        return Forest.treeCount();
    }

    public static final void uproot(Tree tree) {
        Forest.uproot(tree);
    }

    public static final void uprootAll() {
        Forest.uprootAll();
    }

    public static void v(String str, Object... objArr) {
        Forest.v(str, objArr);
    }

    public static void w(String str, Object... objArr) {
        Forest.w(str, objArr);
    }

    public static void wtf(String str, Object... objArr) {
        Forest.wtf(str, objArr);
    }

    public static void d(Throwable th2) {
        Forest.d(th2);
    }

    public static void e(Throwable th2) {
        Forest.e(th2);
    }

    public static void i(Throwable th2) {
        Forest.i(th2);
    }

    public static void log(int i10, Throwable th2) {
        Forest.log(i10, th2);
    }

    public static final void plant(Tree... treeArr) {
        Forest.plant(treeArr);
    }

    public static void v(Throwable th2) {
        Forest.v(th2);
    }

    public static void w(Throwable th2) {
        Forest.w(th2);
    }

    public static void wtf(Throwable th2) {
        Forest.wtf(th2);
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        Forest.d(th2, str, objArr);
    }

    public static void e(Throwable th2, String str, Object... objArr) {
        Forest.e(th2, str, objArr);
    }

    public static void i(Throwable th2, String str, Object... objArr) {
        Forest.i(th2, str, objArr);
    }

    public static void log(int i10, Throwable th2, String str, Object... objArr) {
        Forest.log(i10, th2, str, objArr);
    }

    public static void v(Throwable th2, String str, Object... objArr) {
        Forest.v(th2, str, objArr);
    }

    public static void w(Throwable th2, String str, Object... objArr) {
        Forest.w(th2, str, objArr);
    }

    public static void wtf(Throwable th2, String str, Object... objArr) {
        Forest.wtf(th2, str, objArr);
    }
}

//package net.hadifar.dope.ui.fragment;
//
//import android.graphics.Typeface;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentStatePagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import net.hadifar.dope.model.FlashCard;
//import net.hadifar.dope.model.FlashCardFavoritedItems;
//import net.hadifar.dope.storage.AppDataBaseManager;
//import net.hadifar.dope.ui.widget.pagerIndicator.NumericPageIndicator;
//import net.hadifar.dope.utils.FontHelper;
//import net.hadifar.dope.R;
//
//import java.util.List;
//
///**
// * Amir Hadifar on 31/07/2015
// * Cardy
// * Email : Hadifar.amir@gmail.com
// * Twitter : @HadifarAmir
// */
//
//public class FragmentFavoriteFlashCardViewer extends BaseFragment {
//
//    Bundle mBundle;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.activity_flashcard_viewer, container, false);
//    }
//
//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//
//        mBundle = getArguments();
//        if (mBundle == null)
//            mBundle = savedInstanceState;
//
//        getActivity().setTitle(R.string.nav_favorite);
//
//        SectionsPagerAdapter mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());
//        ViewPager mViewPager = (ViewPager) view.findViewById(R.id.pager);
//        mViewPager.setAdapter(mSectionsPagerAdapter);
//        NumericPageIndicator pageIndicator = (NumericPageIndicator) view.findViewById(R.id.pageIndicator);
//        pageIndicator.setViewPager(mViewPager);
//
//        mViewPager.setCurrentItem(mBundle.getInt(FragmentFavoriteFlashCardList.EXTRA_ID));
//
//        Typeface mFont = FontHelper.getInstance(getActivity()).getIconTypeface();
//        pageIndicator.setTypeface(mFont);
//
//    }
//
//
//
//
//}

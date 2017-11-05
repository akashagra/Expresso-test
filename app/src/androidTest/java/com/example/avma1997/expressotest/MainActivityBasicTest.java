package com.example.avma1997.expressotest;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Avma1997 on 11/5/2017.
 */

public class MainActivityBasicTest  {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule=new ActivityTestRule<>(MainActivity.class);
    @Test
   public void clickIncrementButton_IncrementValues(){
        onView((withId(R.id.button))).perform(click());
        onView((withId(R.id.textView))).check(matches(withText("1")));
        onView(withId(R.id.textView2)).check(matches(withText("5")));



    }


}

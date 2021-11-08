import React from 'react';
import {Link} from "react-router-dom";

export default function Header(){

    return(
        <>
            <div className="header" id="home1">
                <div className="container">
                    <div className="w3l_login">
                        <a href="javascript:void(0)" data-toggle="modal" data-target="#myModal88"><span className="glyphicon glyphicon-user" aria-hidden="true"></span></a>
                    </div>
                    <div className="w3l_logo">
                        <h1><a href="#">Electronic Store<span>Your stores. Your place.</span></a></h1>
                    </div>
                    <div className="search">
                        <input className="search_box" type="checkbox" id="search_box"/>
                        <label  className="icon-search" ><span className="glyphicon glyphicon-search" aria-hidden="true"></span></label>
                        <div className="search_form">
                            <form action="#" method="post">
                                <input type="text" name="Search" placeholder="Search..."/>
                                <input type="submit" value="Send"/>
                            </form>
                        </div>
                    </div>
                    <div className="cart cart box_1">
                        <button  className="w3view-cart" type="submit" name="submit" value="">
                            <i className="fa fa-cart-arrow-down" aria-hidden="true"></i>
                            <span className="cart_count">2</span>
                        </button>

                    </div>
                </div>
            </div>

            <div id="w3lssbmincart">
             
                <div  style={{float:'right',cursor:'pointer'}}>X</div>
                <ul>
                            <li className="sbmincart-item sbmincart-item-changed">
                                <div className="sbmincart-details-name">
                                    <a className="sbmincart-name">fsdfsdf</a>
                                    <ul className="sbmincart-attributes">
                                    </ul>
                                </div>
                                <div className="sbmincart-details-quantity">
                                    {/* <input data-sbmincart-idx="0" name="quantity_1" type="text" pattern="[0-9]*" value="1" autocomplete="off"/>        */}
                                    <span  className="sbmincart-quantity">dfdsfsdf</span>
                                </div>
                                <div className="sbmincart-details-remove">
                                    <button type="button" className="sbmincart-remove" data-sbmincart-idx="0">×</button>
                                </div>
                                <div className="sbmincart-details-price">
                                    <span className="sbmincart-price">dfsdfsdf</span>
                                </div>
                            </li>



                </ul>
                <div>
                    <span>Total: </span>

                    <span>Rs.5345435</span>
                </div>

            </div>

            <div  id="myModal88" >
                <div className="modal-dialog modal-lg">
                    <div className="modal-content">
                        <div className="modal-header">
                            <button  type="button" className="close" data-dismiss="modal" aria-hidden="true">
                                &times;</button>
                            <h4 className="modal-title" id="myModalLabel">

                            </h4>
                        </div>
                        <div className="modal-body  modal-body-sub">
                            <div className="row">
                                <div className="col-md-8 modal_body_left modal_body_left1">
                                    <div className="sap_tabs">
                                        <div id="horizontalTab">
                                            <ul>
                                                <li  className="resp-tab-item" aria-controls="tab_item-0"><span>Sign in</span></li>
                                                <li   className="resp-tab-item" aria-controls="tab_item-1"><span>Sign up</span></li>
                                            </ul>
                                            <div className="tab-1 sign-in resp-tab-content" aria-labelledby="tab_item-0">
                                                <div className="facts">
                                                    <div className="register">

                                                        <form action="#" method="post">
                                                            <input  name="Mobile" placeholder="Enter Mobile" type="text" required=""/>
                                                            <input   name="Password" placeholder="Password" type="password" required=""/>
                                                            <div className="sign-up">
                                                                <input className="btn"  type="button" value="Sign in"/>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                            <div className="tab-2 sign-up resp-tab-content" aria-labelledby="tab_item-1">
                                                <div className="facts">
                                                    <div className="register">

                                                        <form action="#" method="post">
                                                            <input placeholder="Enter Name" name="Name" type="text" required=""/>
                                                            <input  placeholder="Enter Email Address" name="Email" type="email" required=""/>
                                                            <input  placeholder="Enter Mobile" name="mobile" type="text" required=""/>
                                                            <input  placeholder="Enter Password" name="Password" type="password" required=""/>
                                                            <input  placeholder="Enter Confirm Password" name="Password" type="password" required=""/>
                                                            <div className="sign-up">
                                                                <input className="btn" type="button" value="Sign Up"/>
                                                            </div>
                                                        </form>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>


                                </div>
                                {/* <div className="col-md-4 modal_body_right modal_body_right1">
							<div className="row text-center sign-with">
								<div className="col-md-12">
									<h3 className="other-nw">Sign in with</h3>
								</div>
								<div className="col-md-12">
									<ul className="social">
										<li className="social_facebook"><a href="#" className="entypo-facebook"></a></li>
										<li className="social_dribbble"><a href="#" className="entypo-dribbble"></a></li>
										<li className="social_twitter"><a href="#" className="entypo-twitter"></a></li>
										<li className="social_behance"><a href="#" className="entypo-behance"></a></li>
									</ul>
								</div>
							</div>
						</div> */}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}

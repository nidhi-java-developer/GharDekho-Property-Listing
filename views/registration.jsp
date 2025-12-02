<!DOCTYPE html>
<html lang="en">

<%@ include file="header.jsp" %>

        <!-- Contact Start -->
        <div class="container-xxl py-5">
            <div class="container">
                <div class="text-center mx-auto mb-5 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 600px;">
                    <h1 class="mb-3">Register New User</h1>
                    
                </div>
                <div class="row g-4">
                    <div class="col-12">
                        <div class="row gy-4">
                            <div class="col-md-6 col-lg-4 wow fadeIn" data-wow-delay="0.1s">
                                <div class="bg-light rounded p-3">
                                    <div class="d-flex align-items-center bg-white rounded p-3" style="border: 1px dashed rgba(0, 185, 142, .3)">
                                        <div class="icon me-3" style="width: 45px; height: 45px;">
                                            <i class="fa fa-map-marker-alt text-primary"></i>
                                        </div>
                                        <span>123 Street, Indore, MP</span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-4 wow fadeIn" data-wow-delay="0.3s">
                                <div class="bg-light rounded p-3">
                                    <div class="d-flex align-items-center bg-white rounded p-3" style="border: 1px dashed rgba(0, 185, 142, .3)">
                                        <div class="icon me-3" style="width: 45px; height: 45px;">
                                            <i class="fa fa-envelope-open text-primary"></i>
                                        </div>
                                        <span>info@example.com</span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-lg-4 wow fadeIn" data-wow-delay="0.5s">
                                <div class="bg-light rounded p-3">
                                    <div class="d-flex align-items-center bg-white rounded p-3" style="border: 1px dashed rgba(0, 185, 142, .3)">
                                        <div class="icon me-3" style="width: 45px; height: 45px;">
                                            <i class="fa fa-phone-alt text-primary"></i>
                                        </div>
                                        <span>+91-92827637</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 wow fadeInUp" data-wow-delay="0.1s">
                       <iframe src="https://www.google.com/maps/embed?pb=!1m12!1m8!1m3!1d235525.09590357967!2d75.8779131!3d22.7252817!3m2!1i1024!2i768!4f13.1!2m1!1suniversal%20indore%20indore%20iframe%20location!5e0!3m2!1sen!2sin!4v1749125406530!5m2!1sen!2sin" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
                    </div>
                    <div class="col-md-6">
                        <div class="wow fadeInUp" data-wow-delay="0.5s">
                        
                            <form action="reg" method="post">
                                <div class="row g-3">
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="cname" placeholder="Your Name">
                                            <label for="name">Your Name</label>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="form-floating">
                                            <input type="email" class="form-control" name="email" placeholder="Your Email">
                                            <label for="email">Your Email</label>
                                        </div>
                                    </div>
                                    <div class="col-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="aadharno" placeholder="Aadhar Number">
                                            <label for="subject">Aadhar</label>
                                        </div>
                                    </div>
                                     <div class="col-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="mob" placeholder="MOB Number">
                                            <label for="subject">MOB</label>
                                        </div>
                                    </div>
                                     <div class="col-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" name="unm" placeholder="User Name">
                                            <label for="subject">User Name</label>
                                        </div>
                                    </div>
                                     <div class="col-12">
                                        <div class="form-floating">
                                            <input type="password" class="form-control" name="pw" placeholder="Password">
                                            <label for="subject">Password</label>
                                        </div>
                                    </div>
                                     <input type="hidden" name="status" value="0" />
                                    <div class="col-12">
                                        <button class="btn btn-primary w-100 py-3" type="submit">Save Data</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Contact End -->


 <%@ include file="footer.jsp" %>
</body>

</html>